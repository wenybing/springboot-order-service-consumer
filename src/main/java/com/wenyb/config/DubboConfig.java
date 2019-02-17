package com.wenyb.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wenyabing
 * @Date 2019/2/17 16:24
 */

/**
 * 使用API配置dubbo
 */
@Configuration
public class DubboConfig {
    /**
     * <!--应用名-->
     * <dubbo:application name="order-service-consumer" />
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("springboot-order-service-consumer");
        return applicationConfig;
    }

    /**
     * <!--注册地址-->
     * <dubbo:registry address="zookeeper://127.0.0.1:2181" />
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }
    /**
     * <!--声明需要调用的远程服务接口 生成远程代理-->
     <dubbo:reference id="userService" interface="com.wenyb.service.UserService" />
     使用@Reference注解
     */
    /**
     * <!--配置监控中心-->
     * <dubbo:monitor protocol="registry"></dubbo:monitor>
     */
    @Bean
    public MonitorConfig monitorConfig() {
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        return monitorConfig;
    }
}
