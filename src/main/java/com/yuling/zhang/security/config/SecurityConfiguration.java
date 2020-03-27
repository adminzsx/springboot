package com.yuling.zhang.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * security配置类
 * @author zhangshixiang
 * @date 2020-03-26 16:18
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity security) throws Exception {
            security.authorizeRequests()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .and()
                    .logout()
                    .and()
                    .httpBasic();
    }

}
