package cn.skill6.website.dao.mappers.rbac;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cn.skill6.common.entity.po.rbac.RbacSessions;
import cn.skill6.website.Skill6WebsiteApplicationTest;
import cn.skill6.website.util.sequence.SequenceManager;

/**
 * 会话测试类
 *
 * @author 何明胜
 * @version 1.0.0
 * @since 2018年9月23日 下午11:27:43
 */
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RbacSessionsMapperTest extends Skill6WebsiteApplicationTest {
  @Autowired private RbacSessionsMapper rbacSessionsMapper;

  private static Long sessionId = SequenceManager.getNextId();

  @Test
  public void test01Insert() {
    RbacSessions rbacSessions =
        new RbacSessions(sessionId, new Date(), new Date(), true, "session content");

    rbacSessionsMapper.insert(rbacSessions);
  }

  @Test
  public void test02SelectByPrimaryKey() {
    RbacSessions rbacSessions = rbacSessionsMapper.selectByPrimaryKey(sessionId);

    assertEquals("session content", rbacSessions.getSessionContent());
  }

  @Test
  public void test03UpdateByPrimaryKey() {
    RbacSessions rbacSessions =
        new RbacSessions(sessionId, new Date(), new Date(), true, "session content1");

    rbacSessionsMapper.updateByPrimaryKey(rbacSessions);
  }

  @Test
  public void test04SelectAll() {
    List<RbacSessions> rbacSessions = rbacSessionsMapper.selectAll();

    assertNotEquals(null, rbacSessions);
  }

  @Test
  public void test05DeleteByPrimaryKey() {
    rbacSessionsMapper.deleteByPrimaryKey(sessionId);
  }
}
