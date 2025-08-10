package com.haust.back.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.haust.back.entity.New;
import com.haust.back.service.NewService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewController {
    @Autowired
    private NewService newService;
    @ApiOperation("对所有的新闻进行分页查询，默认每次查询5条数据")
    @GetMapping("/news/findbypage/{id}/{size}")
    public IPage<New> getNewsPage(@PathVariable int id,@PathVariable int size)
    {
        return newService.getNewsPage(id,size);
    }
    @ApiOperation("对不同分类的新闻进行分页查询，需传入新闻分类id，默认每次查询5条数据")
    @GetMapping("/news/{cid}/{id}/{size}")
    public IPage<New> getNewsPageByCid(@PathVariable int cid,@PathVariable int id,@PathVariable int size)
    {
        return newService.getNewsPageByCid(cid,id,size);
    }
    @ApiOperation("对不同日期的新闻进行分页查询，需传入新闻日期，默认每次查询5条数据")
    @GetMapping("/news/pagebydate/{date}/{id}/{size}")
    public IPage<New> getNewsPageByDate(@PathVariable String date,@PathVariable int id,@PathVariable int size)
    {
        return newService.getNewsPageByDate(date,id,size);
    }
    @ApiOperation("查询指定新闻的详细内容，需传入新闻id")
    @GetMapping("/newdetail/{id}")
    public New getNewsDetailById(@PathVariable int id)
    {
        return newService.getNewsDetailById(id);
    }
    @ApiOperation("添加一条新闻，需传入新闻的详细内容")
    @PostMapping("/news/insert")
    public New insertNews(New news)
    {
        return newService.insertNews(news);
    }
    @ApiOperation("更新一条新闻信息，根据传入的新闻id进行匹配，需传入更新新闻的详细内容")
    @PutMapping("/news/update")
        public New updateNew(New news)
    {
        return newService.updateNew(news);
    }

    @ApiOperation("删除一条新闻信息，需传入新闻id进行匹配")
    @DeleteMapping("/new/{id}")
    public int  deleteNewById(@PathVariable Integer id)
    {
        return newService.deleteNewById(id);
    }

}

