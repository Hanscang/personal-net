package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.entities.CommonResult;
import org.example.entities.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.controller
 * @date 2024/3/7 23:42
 */

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/get/{id}")
    public CommonResult<User> getByID(@PathVariable("id")int id){
        User user = userService.getByID(id);
        log.info("******* 查询结果 *******" + user);
        if(user != null){
            return new CommonResult(200,"查询成功",user);
        }else{
            return new CommonResult(444,"没有记录,查询ID：" + id,null);
        }
    }

    @PostMapping("/user/addByUser")
    public CommonResult<User> addByUser(@RequestBody User user){
        boolean boo = userService.addByUser(user);
        log.info("******* 添加结果 *******" + boo);
        if(boo){
            return new CommonResult(200,"添加成功",boo);
        }else{
            return new CommonResult(444,"添加失败",boo);
        }
    }
}
