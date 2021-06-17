package com.onebill.Spring.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onebill.Spring.bean.ProductInfo;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"statusCode","msg","description"})
public class ProductInfoResponse {
	
	private int statusCode;
	
	private String msg;
	
	private String description;
	
	private ProductInfo productInfo;
	
	private List<ProductInfo> productInfos;

}
