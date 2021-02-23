package bg.softuni.restclient.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
  @Bean
  public RestTemplate configure(RestTemplateBuilder builder) {
    return builder.build();
  }
}
