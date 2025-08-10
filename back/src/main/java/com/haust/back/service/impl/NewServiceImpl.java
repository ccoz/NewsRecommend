package com.haust.back.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haust.back.entity.New;
import com.haust.back.mapper.NewMapper;
import com.haust.back.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewServiceImpl implements NewService {
    @Autowired
    private NewMapper newMapper;

    @Override
    public IPage<New> getNewsPage(int id, int size) {
        Page<New> page = new Page<>(id, size);
        return newMapper.selectPage(page, null);
    }

    @Override
    public IPage<New> getNewsPageByCid(int cid, int id, int size) {
        Page<New> page = new Page<>(id, size);
        return newMapper.selectPage(page, new QueryWrapper<New>().eq("new_cid", cid));
    }

    @Override
    public IPage<New> getNewsPageByDate(String date, int id, int size) {
        Page<New> page = new Page<>(id, size);
        return newMapper.selectPage(page, new QueryWrapper<New>().eq("new_date", date));
    }

    @Override
    public New getNewsDetailById(int id) {
        return newMapper.selectById(id);
    }

    @Override
    public New insertNews(New news) {
        newMapper.insert(news);
        return news;
    }

    @Override
    public New updateNew(New news) {
        int num = newMapper.update(news, new QueryWrapper<New>().eq("new_id", news.getNewId()));
        return num == 1 ? news : null;
    }

    @Override
    public int deleteNewById(Integer id) {
        return newMapper.deleteById(id);
    }
}

