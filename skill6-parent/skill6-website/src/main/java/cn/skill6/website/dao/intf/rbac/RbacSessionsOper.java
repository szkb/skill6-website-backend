package cn.skill6.website.dao.intf.rbac;

import java.util.List;

import cn.skill6.common.entity.po.rbac.RbacSessions;

/**
 * 会话操作接口
 *
 * @author 何明胜
 * @version 1.0.0
 * @since 2018年9月23日 下午10:48:43
 */
public interface RbacSessionsOper {
  int deleteByPrimaryKey(Long sessionId);

  int addRbacSessions(RbacSessions rbacSessions);

  RbacSessions findByPrimaryKey(Long sessionId);

  List<RbacSessions> findAll();

  int modifyByPrimaryKey(RbacSessions rbacSessions);
}
