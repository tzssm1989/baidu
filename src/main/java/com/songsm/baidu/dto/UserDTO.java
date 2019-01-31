package com.songsm.baidu.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author: ShiMing Song
 * @create: 2019-01-31 13:38
 * @description: 用一句话来描述此类的作用
 **/

@Data
public class UserDTO {

    @NotBlank(message = "姓名必须填写，你个曹老头")
    private String name;
    @NotBlank(message = "密码不能为空，你个曹老头")
    private String password;

    private Integer id;

    private String email;
}
