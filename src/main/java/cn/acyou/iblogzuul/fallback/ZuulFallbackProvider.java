package cn.acyou.iblogzuul.fallback;

import org.springframework.http.client.ClientHttpResponse;

/**
 * 路由熔断
 *
 * 当我们的后端服务出现异常的时候，我们不希望将异常抛出给最外层，期望服务可以自动进行一降级。
 * Zuul给我们提供了这样的支持。当某个服务出现异常时，直接返回我们预设的信息。
 *
 * 我们通过自定义的fallback方法，并且将其指定给某个route来实现该route访问出问题的熔断处理。
 * 主要继承ZuulFallbackProvider接口来实现，ZuulFallbackProvider默认有两个方法，一个用来指明熔断拦截哪个服务，一个定制返回内容。
 * @author youfang
 * @version [1.0.0, 2018-06-22 下午 05:07]
 **/
public interface ZuulFallbackProvider {
    /**
     * The route this fallback will be used for.
     * @return The route the fallback will be used for.
     */
    String getRoute();

    /**
     * Provides a fallback response.
     * @return The fallback response.
     */
    ClientHttpResponse fallbackResponse();
}
