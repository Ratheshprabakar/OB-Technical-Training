package com.onebill.Spring.dao;

import java.util.List;

import com.onebill.Spring.bean.ProductInfo;

public interface ProductDAO {

	public ProductInfo getProduct(int id);

	public List<ProductInfo> getAllProducts();

	public boolean addProduct(ProductInfo productInfo);

	public boolean deleteProduct(int id);

	public boolean updateProduct(ProductInfo productInfo);

}
