package com.zy.blog.service;

import com.zy.blog.dao.pojo.Tag;
import com.zy.blog.vo.Result;
import com.zy.blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long id);

    List<TagVo> hot(int limit);

    /**
     * 查询所以文章标签
     * @return
     */
    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}
