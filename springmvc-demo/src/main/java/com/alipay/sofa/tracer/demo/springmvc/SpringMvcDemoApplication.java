package com.alipay.sofa.tracer.demo.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * SpringMvcDemoApplication
 *
 * @author yangguanchao
 * @since 2018/08/22
 */
@SpringBootApplication
@ImportResource({ "classpath:rpc-reference-example.xml" })
public class SpringMvcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDemoApplication.class, args);
    }
}
