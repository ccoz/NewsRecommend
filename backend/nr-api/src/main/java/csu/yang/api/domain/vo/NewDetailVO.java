package csu.yang.api.domain.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NewDetailVO {
    private Long id;
    private String category;
    private String cover;
    private String title;
    private String content;
    private String url;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
