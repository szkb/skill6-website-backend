package cn.skill6.website.dao.intf.other;

import cn.skill6.common.entity.po.other.CategoryInfo;

import java.util.List;

/**
 * 目录信息操作接口
 *
 * @author 何明胜
 * @version 1.3
 * @since 2018年8月24日 上午12:28:03
 */
public interface CategoryInfoDao {
    int deleteByCategoryId(Long categoryId);

    Long addCategoryInfo(CategoryInfo featureCategoryInfo);

    CategoryInfo findByCategoryId(Long categoryId);

    List<CategoryInfo> findAll();

    void modifyByCategoryId(CategoryInfo featureCategoryInfo);
}