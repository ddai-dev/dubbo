package com;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.ProxyFactory;

/**
 * @author ddai
 * @date 2020/3/4 07:44
 */
public class AppTest {
    public static void main(String[] args) {
//        final ProxyFactory javassist = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getExtension("javassist");
//        System.out.println(javassist);
        final Protocol injvm = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("injvm");
        System.out.println(injvm);
    }
}
