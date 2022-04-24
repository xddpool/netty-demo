package cn.itcast.message;

import lombok.Data;
import lombok.ToString;


@Data
@ToString(callSuper = true)
public class RpcRequestMessage extends Message {

    /**
     * 调用的接口的全限定名,服务器根据他找到实现
     */
    private String interfaceName;

    /**
     * 调用接口中的方法名
     */
    private String methodName;

    /**
     * 方法返回类型
     */
    private Class<?> returnType;

    /**
     * 方法参数类型数组
     */
    private Class[] parameterTypes;

    /**
     * 方法菜蔬值数组
     */
    private Object[] parameterValue;


    public RpcRequestMessage(String interfaceName, String methodName, Class<?> returnType, Class[] parameterTypes, Object[] parameterValue) {
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
        this.parameterValue = parameterValue;
    }


    @Override
    public int getMessageType() {
        return RPC_MESSAGE_TYPE_REQUEST;
    }
}