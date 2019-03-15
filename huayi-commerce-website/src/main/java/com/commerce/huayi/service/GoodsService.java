package com.commerce.huayi.service;

import com.commerce.huayi.api.BusinessException;
import com.commerce.huayi.constant.LanguageEnum;
import com.commerce.huayi.entity.response.CategoryVo;

import java.util.List;

/**
 * 产品服务类
 */
public interface GoodsService {

    /**
     *
     * @param parentId 产品分类父id(一级分类parentId为0)
     * @return 返回ApiResponse接口响应对象
     * @throws BusinessException 抛出业务异常
     */
    List<CategoryVo> getCategories(Long parentId) throws BusinessException;

}
