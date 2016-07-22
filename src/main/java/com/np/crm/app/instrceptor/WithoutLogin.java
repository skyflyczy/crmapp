package com.np.crm.app.instrceptor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 声明此注解的方法将不被{@link LoginInterceptor}拦截器要求先登录。
 * 
 * @author zhiya.chai
 *
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WithoutLogin {

}
