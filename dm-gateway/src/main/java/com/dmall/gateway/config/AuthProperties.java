package com.dmall.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
//拦截路径的属性配置
@Data
@ConfigurationProperties(prefix = "dm.auth")
public class AuthProperties {
    private List<String> includePaths;
    private List<String> excludePaths;
}
