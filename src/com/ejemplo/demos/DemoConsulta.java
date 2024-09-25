package com.ejemplo.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ejemplo.entidades.Usuario;

public class DemoConsulta {

	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass( Usuario.class)
				.buildSessionFactory(); 
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			
			Usuario resultado = session.get(Usuario.class, 2);
			System.out.println("Registro obtenido:" + resultado);
			
			session.getTransaction().commit();
			System.out.println("Proceso Finalizado");
			
		} finally {
			factory.close();
			
		}


	}

}
