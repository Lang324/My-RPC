package lsl.rpc.client;

import lsl.rpc.ByeService;
import lsl.rpc.HelloObject;
import lsl.rpc.HelloService;
import lsl.rpc.serializer.CommonSerializer;
import lsl.rpc.transport.RpcClient;
import lsl.rpc.transport.RpcClientProxy;
import lsl.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 *
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
