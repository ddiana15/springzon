package com.antsrl.springzon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringzonApplication {

	public static void main(String[] args) {
		/*
			Creare un'applicazione Spring boot che simuli uno shop online SPRINGZON

			Entity: (vedete voi dove e come mettere le relazioni tra queste tabelle)
				-User
				-ShoppingCart
				-Product
				-Description

			Definire le classi Repository, Service e Controller per le relative Entity
			per ora operazioni crud su shoppingcart e product

			utilizzare anche lo swagger oltre a postman per testare le chiamate

			Utilizzare git - creare un branch dev_vostroNome a partire da una repo su github
		 */
		SpringApplication.run(SpringzonApplication.class, args);
	}

}
