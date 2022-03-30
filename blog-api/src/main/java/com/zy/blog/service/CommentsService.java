package com.zy.blog.service;

import com.zy.blog.vo.Result;
import com.zy.blog.vo.params.CommentParams;

public interface CommentsService {

    /**
     * 根据文章id 查询所以评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParams commentParams);
}
