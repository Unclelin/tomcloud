package cn.tomcloud.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 01:56 18/8/5
 * @Modified by:
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    RestTemplate restTemplate;

    /**
     * 直接的http访问,不经过注册中心
     */
//    @RequestMapping("")
//    @ResponseBody
//    public String login(){
//        return restTemplate.getForObject("http://localhost:8081/login",String.class);
//    }

    /**
     * @LoadBalanced 经过注册中心
     * @MemberProvider 是服务提供者属性名称 spring.application.name = MemberProvider 也是注册中心的名称
     **/
    @RequestMapping("")
    @ResponseBody
    public String login(){
        return restTemplate.getForObject("http://MemberProvider/login",String.class);
    }
}