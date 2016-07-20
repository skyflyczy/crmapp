package com.np.crm.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * 启动类
 * @author zhiya.chai
 * 2016年7月20日 下午3:32:13
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.huajin.guofubank.session", "com.huajin.guofubank.app"})
@PropertySource("classpath:config.properties")
@ImportResource({"classpath:/spring/spring-cache.xml"})
public class Application {

}
