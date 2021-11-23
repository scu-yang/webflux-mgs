package com.tove.mgs.starter;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"com.tove.mgs","com.mgs.account"})
public class WebfluxMgsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxMgsApplication.class, args);
		System.out.println("启动成功：Sa-Token配置如下：\n" + SaManager.getConfig());
	}
	
}