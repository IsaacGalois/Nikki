package com.portfolio.NikkiSperry.configuration;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

//@Configuration
public class SecurityConfiguration {
	
//	@Value("${spring.security.authentication.method}")
//    private String authenticationMethod;
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//    	
//            httpSecurity
//                    .authorizeRequests().antMatchers("/").permitAll()
//                    .and()
//                    .authorizeRequests().antMatchers("/console/**").permitAll();
//
//        //region Common Security Configuration
//        //use custom login page "/login" mapped to login.jsp by IndexController
//        httpSecurity
//                .formLogin().loginPage("/login").loginProcessingUrl("/login.do") //url->controller    url->action on jsp form
//                .defaultSuccessUrl("/",true).failureUrl("/login?err=1")              //success and failure urls
//                .usernameParameter("username").passwordParameter("password");   //username and password names on login.jsp
//
//        //advancedSettings
//        httpSecurity.csrf().disable();
//        httpSecurity.headers().frameOptions().disable();
//    }
}
