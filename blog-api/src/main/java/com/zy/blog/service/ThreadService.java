package com.zy.blog.service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.zy.blog.dao.mapper.ArticleMapper;
import com.zy.blog.dao.pojo.Article;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ThreadService {

    //期望此操作在线程池，不会影响原有主线程
    @Async("taskExecutor")
    public void updateArticleViewCount(ArticleMapper articleMapper, Article article) {

        int viewCounts = article.getViewCounts();
        Article articleUpdate = new Article();
        articleUpdate.setViewCounts(viewCounts + 1);
        LambdaUpdateWrapper<Article> updateWrapper = new LambdaUpdateWrapper();
        updateWrapper.eq(Article::getId,article.getId());

        //设置一个 为了在多线程的情况下 线程安全
        updateWrapper.eq(Article::getViewCounts,viewCounts);
        articleMapper.update(articleUpdate,updateWrapper);

//        try {
//            Thread.sleep(5000);
//            System.out.println("更新完成了");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
