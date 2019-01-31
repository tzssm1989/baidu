package com.songsm.baidu.controller;

import com.alibaba.fastjson.JSON;
import com.songsm.baidu.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.bind.SchemaOutputResolver;


/**
 * @author: ShiMing Song
 * @create: 2019-01-31 13:18
 * @description: 用一句话来描述此类的作用
 **/

@Controller
@RequestMapping("/demo")
public class DemoController {


    @PostMapping("/s1")
    @ResponseBody
    public String Demo01(@RequestBody @Valid UserDTO userDTO){


        return JSON.toJSONString(userDTO);

    }
}
