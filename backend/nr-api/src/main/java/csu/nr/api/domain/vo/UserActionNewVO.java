package csu.nr.api.domain.vo;

import csu.nr.api.domain.dto.NewDTO;
import lombok.Data;

import java.util.List;

@Data
public class UserActionNewVO {
    private Long userId;
    private NewDTO newDTO;
    private List<Integer> actionList;
    private int value;
}
