module lesson1 {

    requires java.base;     // 默认依赖
    requires java.sql;      // 传递依赖
    requires java.compiler; // exports 控制可访问的 API 包

    exports com.segmentfault.deep.in.java.modular;
}