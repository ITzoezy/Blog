package com.zy.blog.service;

import com.zy.blog.vo.CategoryVo;
import com.zy.blog.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    /**
     *  写文章 文章分类
     * @return
     */
    Result findAll();

    Result findAllDetail();


    Result categoryDetailById(Long id);
}
