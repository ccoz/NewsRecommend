package com.haust.back.controller;

import com.haust.back.entity.Newstatus;
import com.haust.back.service.NewstatusService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewstatusController {
    @Autowired
    private NewstatusService newstatusService;

    @ApiOperation("查询指定新闻内容的行为数据，需传入新闻ID")
    @GetMapping("/newstatus/status/{nid}")
    public Newstatus getstatusbynid(@PathVariable Integer nid) {
        return newstatusService.getStatusByNid(nid);
    }

    @ApiOperation("查询指定nid新闻的点赞数量，需传入新闻ID")
    @GetMapping("/newstatus/like/{nid}")
    public Integer getlike(@PathVariable Integer nid) {
        return newstatusService.getLike(nid);
    }

    @ApiOperation("查询指定nid新闻的点踩数量，需传入新闻ID")
    @GetMapping("/newstatus/gdislike/{nid}")
    public Integer getdislike(@PathVariable Integer nid) {
        return newstatusService.getDislike(nid);
    }

    @ApiOperation("增加指定nid新闻的点赞数量，需传入新闻ID")
    @PostMapping("/newstatus/like")
    public Newstatus postlike(Newstatus newstatus)
    {
        return newstatusService.postLike(newstatus);
    }

    @ApiOperation("增加指定nid新闻的点踩数量，需传入新闻ID")
    @PostMapping("/newstatus/dislike")
    public Newstatus postdislike(Newstatus newstatus) {
        return newstatusService.postDislike(newstatus);
    }

    @ApiOperation("增加指定nid新闻的转发数量，需传入新闻ID")
    @PostMapping("/newstatus/forward")
    public Newstatus postforward(Newstatus newstatus) {
        return newstatusService.postForward(newstatus);
    }
}

