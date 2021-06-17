package com.onebill.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.Spring.bean.ProductInfo;
import com.onebill.Spring.dao.ProductDAO;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductDAO dao;
	
	public ProductInfo getProduct(int id) {
		// TODO Auto-generated method stub
		if(id<0) {
			return null;
		}
	
			return dao.getProduct(id);		
	}
	public List<ProductInfo> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	public boolean addProduct(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		return dao.addProduct(productInfo);
	}
	public boolean deleteProduct(int id) {
		if(id<0) {
			return false;
		}
		// TODO Auto-generated method stub
		return dao.deleteProduct(id);
	}
	public boolean updateProduct(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		return dao.updateProduct(productInfo);
	}

}
