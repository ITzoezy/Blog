package com.zy.blog.vo.params;

import com.zy.blog.dao.pojo.Category;
import com.zy.blog.dao.pojo.Tag;
import com.zy.blog.vo.CategoryVo;
import com.zy.blog.vo.TagVo;
import lombok.Data;

import java.util.List;

@Data
public class ArticleParams {

    private Long id;
    private ArticleBodyParams body;
    private CategoryVo category;
    private String summary;
    private List<TagVo> tags;
    private String title;
}
