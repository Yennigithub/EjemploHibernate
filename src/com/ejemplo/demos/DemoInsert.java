package com.ejemplo.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ejemplo.entidades.Usuario;

public class DemoInsert {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass( Usuario.class)
				.buildSessionFactory(); 
		
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creando usuarios");
			Usuario users = new Usuario ("Rafael", "qatar2233");
			
			session.beginTransaction();
			
			System.out.println("Guardando nuevos usuarios");
			
			session.save(users);
			System.out.println("El usuario se almaceno con el ID:"+users.getUserID());
			
			session.getTransaction().commit();
			System.out.println("Proceso finalizado");
			
			
			
		} finally {
			factory.close();
			
		}

	}

}
