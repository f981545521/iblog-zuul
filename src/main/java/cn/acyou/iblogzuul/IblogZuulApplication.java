package cn.acyou.iblogzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class IblogZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(IblogZuulApplication.class, args);
	}
}
