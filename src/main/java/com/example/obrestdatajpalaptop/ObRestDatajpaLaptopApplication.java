package com.example.obrestdatajpalaptop;

import com.example.obrestdatajpalaptop.entities.Laptop;
import com.example.obrestdatajpalaptop.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObRestDatajpaLaptopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaLaptopApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		//Creo laptops para prueba
		Laptop laptop1 = new Laptop(null,"Dell","Inspiron 14",100d);
		Laptop laptop2 = new Laptop(null,"Lenovo","T430",79.99);

		repository.save(laptop1);
		repository.save(laptop2);

	}

}
