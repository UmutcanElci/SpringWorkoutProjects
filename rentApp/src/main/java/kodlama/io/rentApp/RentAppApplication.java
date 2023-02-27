package kodlama.io.rentApp;

import kodlama.io.rentApp.core.utilities.mappers.ModelMapperManager;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentAppApplication.class, args);
	}

	@Bean//Bu bir nesne ihtiyaç duyulacak diye spring bunu uygulamamızın içine ekler
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
