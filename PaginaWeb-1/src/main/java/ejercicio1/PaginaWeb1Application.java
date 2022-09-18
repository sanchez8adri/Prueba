package ejercicio1;

import controllers.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import controllers.Controladores;

@SpringBootApplication
public class PaginaWeb1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(PaginaWeb1Application.class, args);
		
	}

}
