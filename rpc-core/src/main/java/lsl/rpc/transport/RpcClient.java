package lsl.rpc.transport;

import lsl.rpc.entity.RpcRequest;
import lsl.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 *
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
