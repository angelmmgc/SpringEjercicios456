package com.example.Ejercicios456;

import com.example.Ejercicios456.entities.Laptop;
import com.example.Ejercicios456.model.LaptopRepoitory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicios456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicios456Application.class, args);
		LaptopRepoitory repository = context.getBean(LaptopRepoitory.class);

		Laptop laptop1 = new Laptop(null,"Appel","Air",1299.0);
		Laptop laptop2 = new Laptop(null,"Huawei","matebook",1299.0);
		Laptop laptop3 = new Laptop(null,"Acer","zfp",1299.0);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);


	}

}
