package com.sky.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "用户名",example = "zhangsan")
    private String username;

    @ApiModelProperty(value = "名字",example = "张三")
    private String name;

    @ApiModelProperty(value = "手机号",example = "11111111111")
    private String phone;

    @ApiModelProperty(value = "性别",example = "男")
    private String sex;

    @ApiModelProperty(value = "身份证号",example = "420117200408060873")
    private String idNumber;

}
