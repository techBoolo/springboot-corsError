package et.boo.corsError;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class CorsErrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsErrorApplication.class, args);
	}

//	@CrossOrigin(origins = {"https://www.google.com", "http://localhost:8081"}, methods = { RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(path = "/home")
	public String hello(){
		return "hello";
	}

//	@CrossOrigin(origins = {"https://www.google.com", "http://localhost:8081"})
	@RequestMapping(path = "/test")
	public String test(){
		return "test";
	}
}
