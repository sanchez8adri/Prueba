package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class Controladores {
	
	
	@GetMapping("/cocina.html")
	public String getCocina() {
		return "cocina";
	}
	
	@GetMapping("/clima.html")
	public String getClima() {
		return "clima";
	}
	
	@GetMapping("/finanzas.html")
	public String getFinanza() {
		return "finanza";
	}
	
	@GetMapping("/deportes.html")
	public String getDeportes() {
		return "deportes";
	}
	
	@GetMapping("/tecnologia.html")
	public String getTecnologia() {
		return "tecnologia";
	}

	@GetMapping("/noticias.html")
	public String getNoticias() {
		return "noticias";
	}
}
