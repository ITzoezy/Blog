package com.zy.blog.service;

import com.zy.blog.vo.Result;
import com.zy.blog.vo.params.ArticleParams;
import com.zy.blog.vo.params.PageParams;

public interface ArticleService{

    /**
     * 文章列表
     * @param params
     * @return
     */
    Result listArticle(PageParams params);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    Result newArticles(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    Result findArticleById(Long articleId);

    /**
     * 发表文章服务
     * @param articleParams
     * @return
     */
    Result publish(ArticleParams articleParams);
}

