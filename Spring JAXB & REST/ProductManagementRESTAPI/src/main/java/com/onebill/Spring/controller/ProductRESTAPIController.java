package com.onebill.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.Spring.bean.ProductInfo;
import com.onebill.Spring.response.ProductInfoResponse;
import com.onebill.Spring.service.ProductService;

@RestController
public class ProductRESTAPIController {

	@Autowired
	ProductService service;

	@GetMapping(path = "/getProduct", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ProductInfoResponse getProduct(Integer id) {

		ProductInfo productInfo = service.getProduct(id);

		ProductInfoResponse response = new ProductInfoResponse();

		if (productInfo != null) {
			response.setMsg("Success");
			response.setStatusCode(200);
			response.setDescription("Data Found for ID " + id);
			response.setProductInfo(productInfo);
		} else {
			response.setMsg("Failure");
			response.setStatusCode(400);
			response.setDescription("Data Not Found for ID " + id);
		}
		return response;

	}// end of getProduct

	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ProductInfoResponse getAllProducts() {
		List<ProductInfo> productInfos = service.getAllProducts();

		ProductInfoResponse response = new ProductInfoResponse();

		if (productInfos != null) {
			response.setMsg("Success");
			response.setStatusCode(200);
			response.setDescription("Data Found ");
			response.setProductInfos(productInfos);
		} else {
			response.setMsg("Failure");
			response.setStatusCode(400);
			response.setDescription("Table is empty");
		}
		return response;

	} // end of getAll

	@PostMapping(path = "/add", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ProductInfoResponse addProduct(@RequestBody ProductInfo productInfo) {
		ProductInfoResponse response = new ProductInfoResponse();

		if (service.addProduct(productInfo)) {
			response.setMsg("Success");
			response.setStatusCode(200);
			response.setDescription("Data Added");
		} else {
			response.setMsg("Failure");
			response.setStatusCode(400);
			response.setDescription("Data Not added");
		}
		return response;
	} // end of add Product

	@DeleteMapping(path="/delete/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE } )
	public ProductInfoResponse deleteProduct(@PathVariable(name="id") int id) {
		ProductInfoResponse response = new ProductInfoResponse();
		if(service.deleteProduct(id)) {
			response.setMsg("Success");
			response.setStatusCode(200);
			response.setDescription("Data Deleted");
		}else {
			response.setMsg("Failure");
			response.setStatusCode(400);
			response.setDescription("Data Not Found");
		}
		return response;
	}// end of Delete Product
	
	@PutMapping(path="/update", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	public ProductInfoResponse updateProduct(@RequestBody ProductInfo productInfo) {
		
		ProductInfoResponse response = new ProductInfoResponse();
		if(service.updateProduct(productInfo)) {
			response.setMsg("Success");
			response.setStatusCode(200);
			response.setDescription("Data Updated");
			response.setProductInfo(productInfo);
		}else {
			response.setMsg("Failure");
			response.setStatusCode(400);
			response.setDescription("Data Not Found");
		}
		return response;	}
}
