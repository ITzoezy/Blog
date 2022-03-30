package com.zy.blog.controller;

import com.zy.blog.service.CommentsService;
import com.zy.blog.vo.Result;
import com.zy.blog.vo.params.CommentParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id){
        return commentsService.commentsByArticleId(id);
    }


    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParams commentParams){
        return commentsService.comment(commentParams);
    }
}
