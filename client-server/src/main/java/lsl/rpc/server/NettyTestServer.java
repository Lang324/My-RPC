package lsl.rpc.server;

import lsl.rpc.annotation.ServiceScan;
import lsl.rpc.serializer.CommonSerializer;
import lsl.rpc.transport.RpcServer;
import lsl.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 *
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
