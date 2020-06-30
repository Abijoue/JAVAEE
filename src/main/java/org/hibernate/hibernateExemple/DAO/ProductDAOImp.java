package org.hibernate.hibernateExemple.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.hibernateExemple.Entities.Product;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProductDAOImp implements EntityRepository<Product>{
	
	@PersistenceContext
	private EntityManager _entityManager;

	@Override
	public Product save(Product p) {
		_entityManager.persist(p);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> finByName(String name) {
		Query req = _entityManager.createQuery("select p from Product p where p.name like : val");
		req.setParameter("val", name);
		return req.getResultList();
	}

	@Override
	public Product findOne(Long id) {
		Product p = _entityManager.find(Product.class, id);
		return p;
	}

	@Override
	public Product update(Product p) {
		_entityManager.merge(p);
		return p;
	}

	@Override
	public void delete(Long id) {
		Product p = _entityManager.find(Product.class, id);
		_entityManager.remove(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAll() {
		Query req = _entityManager.createQuery("select p from Product p");
		return req.getResultList();
	}
	
	

}
