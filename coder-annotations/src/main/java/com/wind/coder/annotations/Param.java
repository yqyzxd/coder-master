package com.wind.coder.annotations;

public @interface Param {

    String viewCanonicalName();
    String responseCanonicalName();
    String requestCanonicalName();
   /* Processor中不支持对class访问
    Class viewClass();
    Class requestClass();
    Class responseClass();*/

    String baseName() default "";
    String basePackage() default "";
    boolean page() default false;//是否是分页的，决定是继承retrofitusecase还是pageusecase
}
