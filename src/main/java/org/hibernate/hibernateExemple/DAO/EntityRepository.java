package org.hibernate.hibernateExemple.DAO;

import java.util.List;


public interface EntityRepository<T> {

public T save(T p);
public List<T> findAll();
public List<T> finByName(String name);
public T findOne(Long id);
public T update(T p);
public void delete(Long id);

}

//public interface ProductDAO {
//	
//	public Product save(Product p);
//	public List<Product> finAll();
//	public List<Product> finByBrand(String br);
//	public Product findOne(Long id);
//	public Product update(Product p);
//	public void delete(Long id);
//	
//}
