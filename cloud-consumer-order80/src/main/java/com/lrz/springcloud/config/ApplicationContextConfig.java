package com.lrz.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author L1ENO
 * @create 2023/06/04 - 17:01
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced  //自己写负载均衡算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
