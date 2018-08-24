package cn.tomcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 00:16 18/8/5
 * @Modified by:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MemberProviderApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(MemberProviderApplication.class, args);
    }
}
