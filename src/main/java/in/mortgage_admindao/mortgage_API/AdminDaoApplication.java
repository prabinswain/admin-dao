package in.mortgage_admindao.mortgage_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AdminDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminDaoApplication.class, args);
	}

}
