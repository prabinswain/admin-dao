package in.mortgage_admindao.mortgage_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication //(exclude = DataSourceAutoConfiguration.class)
public class AdminDaoApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(AdminDaoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("connection  :" + dataSource.getConnection());
        System.out.println("datasource name :"+dataSource.getClass().getName());
        System.out.println("method name :"+dataSource.getClass().getEnclosingMethod());
        System.out.println("login timeout :"+dataSource.getLoginTimeout());
//        System.out.println(dataSource.getLogWriter());

    }
}
