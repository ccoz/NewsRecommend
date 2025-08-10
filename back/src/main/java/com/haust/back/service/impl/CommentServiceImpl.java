package com.haust.back.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haust.back.entity.Comment;
import com.haust.back.mapper.CommentMapper;
import com.haust.back.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Comment insertComment(Comment comment) {
        Date date = new Date();
        Timestamp t = new Timestamp(date.getTime());
        comment.setCDate(t);
        commentMapper.insert(comment);
        return comment;
    }

    @Override
    public IPage<Comment> getCommentById(Integer nid, int id, int size) {
        Page<Comment> page = new Page<>(id, size);
        return commentMapper.selectPage(page, new QueryWrapper<Comment>().eq("new_id", nid));
    }

    @Override
    public Integer getLike(Integer nid) {
        return commentMapper.selectCount(new QueryWrapper<Comment>().eq("new_id", nid));
    }

    @Override
    public Integer getDislike(Integer nid) {
        return commentMapper.selectCount(new QueryWrapper<Comment>().eq("new_id", nid));
    }

    @Override
    public Integer postLike(Integer nid) {
        return commentMapper.selectCount(new QueryWrapper<Comment>().eq("new_id", nid));
    }

    @Override
    public Integer postDislike(Integer nid) {
        return commentMapper.selectCount(new QueryWrapper<Comment>().eq("new_id", nid));
    }
}

