package com.segmentfault.deep.in.java.functional;

import java.util.function.Supplier;

public class SupplierDesignDemo {

    public static void main(String[] args) {
//        echo("Hello, World!");  // 固定参数
//
//        echo(() -> {    // 变化实现
//            sleep(1000);
//            return "Hello, World!";
//        });
//        echo(SupplierDesignDemo::getMessage);


        System.out.println(getMessage());   // 及时返回

        Supplier<String> message = supplierMessage();   // 待执行

        System.out.println(message.get());  // 实际执行

    }

    private static String getMessage() {
        sleep(1000);
        return "Hello, World!";
    }

    private static Supplier<String> supplierMessage() {
        return SupplierDesignDemo::getMessage;
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void echo(String message) {  // 拉的模式
        System.out.println(message);
    }

    private static void echo(Supplier<String> message) {    // 推的模式
        System.out.println(message.get());
    }
}
