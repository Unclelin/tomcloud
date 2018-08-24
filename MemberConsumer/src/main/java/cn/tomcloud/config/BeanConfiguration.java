package cn.tomcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 01:52 18/8/5
 * @Modified by:
 */
@Configuration
public class BeanConfiguration {

// 直接的http访问,不经过注册中心
//    @Bean
//    public RestTemplate getReatTemplate(){
//        return new RestTemplate();
//    }

    /**
     * @LoadBalanced 经过注册中心
     **/
    @Bean
    @LoadBalanced
    public RestTemplate getReatTemplate(){
        return new RestTemplate();
    }

}
