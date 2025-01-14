package csu.nr.news.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.nr.news.mapper.NewMapper;
import csu.nr.news.service.INewService;
import csu.nr.api.domain.dto.NewDTO;
import csu.nr.api.domain.po.New;
import csu.nr.api.domain.vo.NewDetailVO;
import csu.nr.api.enums.NewStatus;
import org.springframework.stereotype.Service;

@Service
public class NewServiceimpl extends ServiceImpl<NewMapper, New> implements INewService {
    @Override
    public NewDetailVO FindNewDetail(NewDTO newDTO) {
        // 1.获取新闻信息
        Long id = newDTO.getId();
        // 2.根据id查询新闻信息
        New news = lambdaQuery().eq(New::getId, id).one();
        // 3.校验是否有效
        if (news.getStatus() == NewStatus.FROZEN) {
            throw new IllegalArgumentException("新闻无法访问");
        }
        // 4.封装VO返回
        NewDetailVO newDetailVO = new NewDetailVO();
        newDetailVO.setId(id);
        newDetailVO.setCategory(news.getCategory());
        newDetailVO.setContent(news.getContent());
        newDetailVO.setTitle(news.getTitle());
        newDetailVO.setCover(news.getCover());
        newDetailVO.setUrl(news.getUrl());
        newDetailVO.setCreateTime(news.getCreateTime());
        newDetailVO.setUpdateTime(news.getUpdateTime());
        return newDetailVO;
    }
}
