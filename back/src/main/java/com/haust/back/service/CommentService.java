package com.haust.back.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.haust.back.entity.Comment;

public interface CommentService {
    Comment insertComment(Comment comment);
    IPage<Comment> getCommentById(Integer nid, int id, int size);
    Integer getLike(Integer nid);
    Integer getDislike(Integer nid);
    Integer postLike(Integer nid);
    Integer postDislike(Integer nid);
}

