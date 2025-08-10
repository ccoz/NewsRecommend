package com.haust.back.service;

import com.haust.back.entity.Newstatus;

public interface NewstatusService {
    Newstatus getStatusByNid(Integer nid);
    Integer getLike(Integer nid);
    Integer getDislike(Integer nid);
    Newstatus postLike(Newstatus newstatus);
    Newstatus postDislike(Newstatus newstatus);
    Newstatus postForward(Newstatus newstatus);
}

