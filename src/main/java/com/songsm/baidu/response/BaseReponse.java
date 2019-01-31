package com.songsm.baidu.response;

import lombok.Data;

import java.util.List;

/**
 * @author: ShiMing Song
 * @create: 2019-01-31 14:45
 * @description: 用一句话来描述此类的作用
 **/
@Data
public class BaseReponse<T> {

     Integer code;

     String message;

     List<T> data;
}
