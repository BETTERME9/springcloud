package com.zhss.springcloud.eurekaclientc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description : //TODO
 * @Author : BETTERME
 */
@FeignClient(name="ServecieA")
public class IServiceInterface {


    String getUserInfo(@PathVariable String id) {
        return null;
    }
}
