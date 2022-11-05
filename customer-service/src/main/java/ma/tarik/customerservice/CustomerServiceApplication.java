package ma.tarik.customerservice;

import ma.tarik.customerservice.entities.Customer;
import ma.tarik.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("Tarik").email("tarik@gmail.com").build(),
					Customer.builder().name("Hassan").email("hasan@gmail.com").build(),
					Customer.builder().name("khalil").email("khalil@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
