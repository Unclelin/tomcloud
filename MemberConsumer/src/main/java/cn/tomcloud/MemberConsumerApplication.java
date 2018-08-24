package cn.tomcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 01:47 18/8/5
 * @Modified by:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MemberConsumerApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(MemberConsumerApplication.class ,args);

    }
}
