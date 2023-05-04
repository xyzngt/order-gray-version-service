package com.gray.business.feigns;

import feign.HeaderMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;

/**
 * OrderServiceFeignClient interface
 *
 * @author xyzngtt
 *
 */
@Component
@FeignClient(name = "ORDER-SERVICE",contextId = "orderServiceFeignClient")
public interface OrderServiceFeignClient {
    /**
     * 获取order-service版本号
     * @param version 请求头版本号
     * @return version order-service版本号
     */
    @GetMapping("/order/version")
    String getOrderServiceVersion(@RequestHeader("version") String version);
}
