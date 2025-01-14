package csu.nr.api.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import csu.nr.api.enums.NewStatus;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("new")
public class New implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String category;
    private String cover;
    private String title;
    private String content;
    private String url;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private NewStatus status;
}