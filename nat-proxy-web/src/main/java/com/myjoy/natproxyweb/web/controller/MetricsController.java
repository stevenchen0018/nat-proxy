package com.myjoy.natproxyweb.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: steven.chen
 * @Title: MetricsController
 * @ProjectName: nat-proxy
 * @Description:
 * @date: 2022/2/8 11:51 AM
 **/
@RestController
@RequestMapping("/metrics")
public class MetricsController {

    private static final Logger logger = LoggerFactory.getLogger(MetricsController.class);
    /**
     * todo
     * 1.获取用户所有流量统计
     * 2.获取用户对应设备流量统计
     */

    /**
     *
     * @param request
     * @param userId
     * @return
     */
    @GetMapping("/get/{}")
    public Object get(HttpServletRequest request,Long userId){
        return  null;
    }



}
