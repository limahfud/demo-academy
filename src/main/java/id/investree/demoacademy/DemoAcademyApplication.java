package id.investree.demoacademy;

import id.investree.demoacademy.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAcademyApplication.class, args);
	}

	@Bean("anotherUser")
	public User getAnotherUser() {
		return new User();
	}

	@Bean("defaultUser")
	public User getDefaultUser() {
		User user = new User();
		user.setId(99);
		user.setName("Jono");
		user.setAddress("Tangsel");
		user.setAge(19);
		user.setGender("male");
		return user;
	}
}
