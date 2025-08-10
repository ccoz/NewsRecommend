package com.haust.back.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.haust.back.entity.New;

public interface NewService {
    IPage<New> getNewsPage(int id, int size);
    IPage<New> getNewsPageByCid(int cid, int id, int size);
    IPage<New> getNewsPageByDate(String date, int id, int size);
    New getNewsDetailById(int id);
    New insertNews(New news);
    New updateNew(New news);
    int deleteNewById(Integer id);
}

