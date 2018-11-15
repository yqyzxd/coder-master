package com.wind.coder.annotations;

public @interface Param {

   /* String viewCanonicalName();
    String responseCanonicalName();
    String requestCanonicalName();*/
    Class viewClass();
    Class requestClass();
    Class responseClass();

    String baseName() default "";
    String basePackage() default "";
    boolean page() default false;
}
