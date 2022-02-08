package com.myjoy.natproxyweb.web.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: steven.chen
 * @Title: Metrics
 * @ProjectName: nat-proxy
 * @Description:
 * @date: 2022/2/8 11:27 AM
 **/
@Data
@AllArgsConstructor
@ToString
public class Metrics implements Serializable {

    private int port;

    private long readBytes;

    private long wroteBytes;

    private long readMsgs;

    private long wroteMsgs;

    private int channels;

    private long timestamp;

}
