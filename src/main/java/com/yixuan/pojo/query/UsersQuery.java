package com.yixuan.pojo.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersQuery {
    private Integer pageNum = 1; //当前页码
    private Integer pageSize = 10; //每一页显示的数量
    private String name;
}
