package cn.tomcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 00:12 18/8/5
 * @Modified by:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(EurekaServerApplication.class ,args);
    }
}
