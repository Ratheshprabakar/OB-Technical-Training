package com.onebill.Spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.onebill.Spring.bean.ProductInfo;

@Repository
public class ProductDAOImplementation implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	public ProductInfo getProduct(int id) {

		// EntityManagerFactory factory = Persistence.createEntityManagerFactory("pms");
		EntityManager manager = factory.createEntityManager();

		ProductInfo productInfo = manager.find(ProductInfo.class, id);

		manager.close();
		// factory.close();

		return productInfo;
	}

	public List<ProductInfo> getAllProducts() {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		String query = "from ProductInfo";
		Query q = manager.createQuery(query);

		List<ProductInfo> productInfos = q.getResultList();

		manager.close();
		return productInfos;
	}

	public boolean addProduct(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(productInfo);
			transaction.commit();
			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteProduct(int id) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			ProductInfo product = manager.find(ProductInfo.class, id);
			manager.remove(product);
			transaction.commit();
			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateProduct(ProductInfo productInfo) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			ProductInfo originalProduct = manager.find(ProductInfo.class, productInfo.getPid());
			
			originalProduct.setName(productInfo.getName());
			originalProduct.setCatagory(productInfo.getCatagory());
			originalProduct.setPrice(productInfo.getPrice());
			
			transaction.commit();
			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
