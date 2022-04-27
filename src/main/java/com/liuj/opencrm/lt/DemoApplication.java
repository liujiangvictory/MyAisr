package com.liuj.opencrm.lt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},scanBasePackages = {"com.liuj.opencrm.lt.web"})
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
// @ComponentScan("com.liuj.opencrm.lt.web")
//位置在java包下面开始
 // @MapperScan(basePackages="com.liuj.opencrm.lt.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
