package com.tingyun;

import com.tingyun.config.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class SpringCloudZuulApplication {



	public static void main(String[] args) {

        new SpringApplicationBuilder(SpringCloudZuulApplication.class).web(true).run(args);
	}

    @Bean
    public AccessFilter getAccessFilter(){
        return new AccessFilter();
    }
}
