package the.flash.server.handler.inbound;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class InBoundHandlerC extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("InBoundHandlerC: " + msg);

        // 这一行是真正触发OutBoundHandlerC/OutBoundHandlerB/OutBoundHandlerA操作，
        // 一旦注释掉，后续写操作不会进行
        ctx.channel().writeAndFlush(msg);
    }
}
