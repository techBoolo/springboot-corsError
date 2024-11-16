package et.boo.corsError.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "custom.cors")
public class CorsConfig implements WebMvcConfigurer {

  private String[] allowedOrigins;
  private String[] allowedMethods;
  private String[] allowedHeaders;
  private Boolean allowCredentials;

  @Override
  public void addCorsMappings(CorsRegistry corsRegistry){
    corsRegistry.addMapping("/**")
      .allowedOrigins(allowedOrigins)
      .allowedMethods(allowedMethods)
      .allowedHeaders(allowedHeaders)
      .allowCredentials(allowCredentials);
  }
}
