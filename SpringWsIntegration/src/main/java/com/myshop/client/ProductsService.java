package com.myshop.client;

import org.springframework.integration.annotation.Gateway;

import com.myshop.webservices.getproductsservices.GetProductsRequest;
import com.myshop.webservices.getproductsservices.GetProductsResponse;

public interface ProductsService {
	@Gateway
	public GetProductsResponse getProduct(GetProductsRequest request);
}
