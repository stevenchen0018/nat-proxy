package com.myjoy.natproxyweb.module.tcp;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

/**
 * @Author: steven.chen
 * @Title: HttpServerInitializer
 * @ProjectName: nat-proxy
 * @Description:
 * @date: 2022/2/8 2:27 PM
 **/
public class HttpServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        ChannelPipeline pipeline = socketChannel.pipeline();

    }
}
