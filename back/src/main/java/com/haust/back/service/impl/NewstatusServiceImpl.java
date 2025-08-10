package com.haust.back.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.haust.back.entity.Newstatus;
import com.haust.back.mapper.NewstatusMapper;
import com.haust.back.service.NewstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewstatusServiceImpl implements NewstatusService {
    @Autowired
    private NewstatusMapper newstatusMapper;

    @Override
    public Newstatus getStatusByNid(Integer nid) {
        return newstatusMapper.selectOne(new QueryWrapper<Newstatus>().eq("new_id", nid));
    }

    @Override
    public Integer getLike(Integer nid) {
        return newstatusMapper.selectCount(new QueryWrapper<Newstatus>().eq("new_id", nid));
    }

    @Override
    public Integer getDislike(Integer nid) {
        return newstatusMapper.selectCount(new QueryWrapper<Newstatus>().eq("new_id", nid));
    }

    @Override
    public Newstatus postLike(Newstatus newstatus) {
        newstatus.setNewLike(newstatus.getNewLike() + 1);
        newstatusMapper.update(newstatus, new QueryWrapper<Newstatus>().eq("new_id", newstatus.getNewId()));
        return newstatus;
    }

    @Override
    public Newstatus postDislike(Newstatus newstatus) {
        newstatus.setNewDislike(newstatus.getNewDislike() + 1);
        newstatusMapper.update(newstatus, new QueryWrapper<Newstatus>().eq("new_id", newstatus.getNewId()));
        return newstatus;
    }

    @Override
    public Newstatus postForward(Newstatus newstatus) {
        newstatus.setNewForward(newstatus.getNewForward() + 1);
        newstatusMapper.update(newstatus, new QueryWrapper<Newstatus>().eq("new_id", newstatus.getNewId()));
        return newstatus;
    }
}

