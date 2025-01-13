package csu.nr.news.service;

import com.baomidou.mybatisplus.extension.service.IService;
import csu.yang.api.domain.dto.NewDTO;
import csu.yang.api.domain.po.New;
import csu.yang.api.domain.vo.NewDetailVO;

public interface INewService extends IService<New> {
    NewDetailVO FindNewDetail(NewDTO newDTO);
}
