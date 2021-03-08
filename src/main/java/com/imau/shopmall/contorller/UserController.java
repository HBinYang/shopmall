package com.imau.shopmall.contorller;

import com.imau.shopmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HBYang
 * @date 2021/3/5 16:34
 */
@RestController//返回json格式的数据
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userServiceI;
    @RequestMapping("/index")
    public String Index(){
        userServiceI.save("test");
        return "index";
    }
}