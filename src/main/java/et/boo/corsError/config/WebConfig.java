package et.boo.corsError.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  private final CorsProperties corsProperties;

  public WebConfig(CorsProperties corsProperties) {
    this.corsProperties = corsProperties;
  }

  @Override
  public void addCorsMappings(CorsRegistry corsRegistry){
    corsRegistry.addMapping("/**")
      .allowedOrigins(corsProperties.getAllowedOrigins())
      .allowedMethods(corsProperties.getAllowedMethods())
      .allowedHeaders(corsProperties.getAllowedHeaders())
      .allowCredentials(corsProperties.getAllowCredentials());
  }
}