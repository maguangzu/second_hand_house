package com.wintop.ms.fs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangzijuan
 * @Description:
 * @date 2018-03-04
 */
@Controller
public class TestController {
    @RequestMapping("register")
    public String file(){
        return "/register_login";
    }

    @RequestMapping("user")
    public String user(){
        return "/testuser";
    }
}
