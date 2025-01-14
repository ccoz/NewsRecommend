package csu.nr.news.service;

import com.baomidou.mybatisplus.extension.service.IService;
import csu.nr.api.domain.dto.NewDTO;
import csu.nr.api.domain.po.New;
import csu.nr.api.domain.vo.NewDetailVO;

public interface INewService extends IService<New> {
    NewDetailVO FindNewDetail(NewDTO newDTO);
}
