package net.javagudies.springboot_backend;

import net.javagudies.springboot_backend.model.Employee;
import net.javagudies.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class,args);

	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("Sandhyarani");
		employee.setLastName("sagar");
		employee.setEmailId("sandhya@gmail.com");
		employeeRepository.save(employee);


		Employee employee1 = new Employee();
		employee1.setFirstName("Srusti");
		employee1.setLastName("patil");
		employee1.setEmailId("srusti@gmail.com");
		employeeRepository.save(employee1);


	}
}