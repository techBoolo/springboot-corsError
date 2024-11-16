package et.boo.corsError.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "custom.cors")
public class CorsProperties {

  private String[] allowedOrigins;
  private String[] allowedMethods;
  private String[] allowedHeaders;
  private Boolean allowCredentials;

}
