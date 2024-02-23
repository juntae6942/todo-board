package backend.likelion.todos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// [2단계] @ConfigurationProperties 을 사용하기 위해서는 필수적으로 선언해야 합니다.
@SpringBootApplication
public class TodosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

}
