package cn.tomcloud.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 01:44 18/8/5
 * @Modified by:
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("")
    @ResponseBody
    public String login(){

        return "hello world";
    }
}
