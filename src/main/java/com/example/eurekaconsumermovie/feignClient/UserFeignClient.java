package com.example.eurekaconsumermovie.feignClient;

import com.example.eurekaconsumermovie.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * liyan-下午5:17
 **/

@FeignClient(name = "eureka-provider-user")
@Component
public interface UserFeignClient {
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id);
}
