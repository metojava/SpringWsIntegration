package com.exam;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myshop.client.ProductsService;
import com.myshop.webservices.getproductsservices.GetProductsRequest;
import com.myshop.webservices.getproductsservices.GetProductsResponse;
import com.shop.my.Products;

@ContextConfiguration(locations = "classpath:META-INF/spring/integration/*-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestIntegration {

	@Autowired
	ProductsService productsService;

	@Test
	public void getProductById() {
		GetProductsRequest request = new GetProductsRequest();
		request.setPid("1");
		GetProductsResponse response = productsService.getProduct(request);
		Products p = response.getProductsDetails();
		System.out.println(p.getPname()+" - "+p.getPdescr());
		assertNotNull(response);
		
	}
}
