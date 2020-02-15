package pl.sda.zad5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sda.zad5.model.Customer;
import pl.sda.zad5.repository.CustomerRepository;

@SpringBootApplication
public class Zad5Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Zad5Application.class, args);
	}

	@Override
	public void run(String... args) {
		createCustomer("Ola", "Nowak");
		createCustomer("Kasia", "Pogorzelska");
		createCustomer("Monika", "Górska");
		createCustomer("Ola", "Nowa");
		createCustomer("Justyna", "Wiejska");

		System.out.println(customerRepository.findAll());

	}

	private void createCustomer(String firstName, String lastName) {
		Customer customer1 = new Customer(firstName, lastName);
		customerRepository.save(customer1);
	}

}
