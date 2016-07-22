package com.np.crm.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.np.crm.app.insterceptor.LoginInterceptor;


/**
 * spring mvc 配置类。
 * 
 * @author zhiya.chai
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public LoginInterceptor loginInterceptor() {
		return new LoginInterceptor();
	}
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor());
	}
}
