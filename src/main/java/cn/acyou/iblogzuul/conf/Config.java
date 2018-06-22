package cn.acyou.iblogzuul.conf;

import cn.acyou.iblogzuul.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author youfang
 * @version [1.0.0, 2018-06-22 下午 05:00]
 **/
@Configuration
public class Config {
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
