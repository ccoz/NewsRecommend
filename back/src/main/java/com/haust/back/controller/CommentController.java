package com.haust.back.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.haust.back.entity.Comment;
import com.haust.back.service.CommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
    @ApiOperation("添加一条评论，需传入评论内容")
    @PostMapping("/comment/insert")
    public Comment insertComment(Comment comment)
    {
        return commentService.insertComment(comment);
    }
    @ApiOperation("分页查询指定nid新闻的所有评论，需传入新闻ID，默认每次查询5条数据")
    @GetMapping("/comment/{nid}/{id}/{size}")
    public IPage<Comment> getCommentByid(@PathVariable Integer nid,@PathVariable int id,@PathVariable int size)
    {
        return commentService.getCommentById(nid,id,size);
    }
    @ApiOperation("查询指定nid新闻的点赞数量，需传入新闻ID")
    @GetMapping("/comment/like/{nid}")
    public Integer getlike(@PathVariable Integer nid)
    {
        return commentService.getLike(nid);
    }
    @ApiOperation("查询指定nid新闻的点踩数量，需传入新闻ID")
    @GetMapping("/comment/gdislike/{nid}")
    public Integer getdislike(@PathVariable Integer nid)
    {
        return commentService.getDislike(nid);
    }
    @ApiOperation("增加指定nid新闻的点赞数量，需传入新闻ID")
    @GetMapping("/comment/plike/{nid}")
    public Integer postlike(@PathVariable Integer nid)
    {
        return commentService.postLike(nid);
    }
    @ApiOperation("增加指定nid新闻的点踩数量，需传入新闻ID")
    @GetMapping("/comment/pdislike/{nid}")
    public Integer postdislike(@PathVariable Integer nid)
    {
        return commentService.postDislike(nid);
    }
}

