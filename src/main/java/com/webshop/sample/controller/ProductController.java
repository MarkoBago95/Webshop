package com.webshop.sample.controller;

import com.webshop.sample.entity.Product;
import com.webshop.sample.service.HnbApi;
import com.webshop.sample.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/product/")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(path = "/hello")
	public String getMessage() {
		return "Hello boot";
	}

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		HnbApi api = new HnbApi();
		Double currency = api.getCurreny();

		Double result = product.getPriceHrk() * (1 / currency);
		result = result * 100;
		result = (double) Math.round(result);
		result = result / 100;

		product.setPriceEur(result);
		return productService.saveProduct(product);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {

		return productService.updateProduct(product);
	}

	@GetMapping("/getall")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/getone/{id}")
	public Product getProducts(@PathVariable(name = "id") Long id) {
		return productService.getProduct(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable(name = "id") Long id) {
		productService.deleteProduct(id);
	}
}
