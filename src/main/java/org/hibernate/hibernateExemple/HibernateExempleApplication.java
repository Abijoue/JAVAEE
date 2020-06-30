package org.hibernate.hibernateExemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"DAO"})
public class HibernateExempleApplication {

//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		SpringApplication.run(HibernateExempleApplication.class, args);
		
//		ApplicationContext cntx = SpringApplication.run(HibernateExempleApplication.class, args);
//		
//		EntityRepository<Product> ProductDAO = cntx.getBean(EntityRepository.class);
//	
//		ProductDAO.save(new Product("NOTEBOOK 350V5", "Samsung", "South Korea", 750));
//		ProductDAO.save(new Product("XPS 15", "DELL", "USA", 999));
//		ProductDAO.save(new Product("MACBOOK PRO", "APPEL", "USA", 1000));
//		ProductDAO.save(new Product("G5", "Asus", "Taiwan", 700));
//		
//		List<Product> products = ProductDAO.findAll();
//		System.out.println("______select * from product_______");
//		for(Product p : products) {
//			System.out.println("________________________");
//			System.out.println("Name :"+p.getName());
//			System.out.println("Made In  :"+p.getMadein());
//		}
//		
//		List<Product> products2 = ProductDAO.finByMadeIN("USA");
//		for(Product p : products2) {
//			System.out.println("_______select * from product where madein Like \""+p.getMadein()+"\"__________");
//			System.out.println("Name :"+p.getName());
//			System.out.println("Made In  :"+p.getMadein());
//		}
		

	}

}
