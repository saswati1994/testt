package com.example.restaurantservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurantservice.model.Cart;
import com.example.restaurantservice.model.Item;
import com.example.restaurantservice.repository.CartRepository;
import com.example.restaurantservice.repository.ItemRepository;

@RestController
public class TestController {


	  @Autowired
	  private CartRepository cartRepository;
	  
	  @Autowired
	  private ItemRepository itemRepository;
	  
	  @PostMapping("/item")
	  public void addItem(@RequestBody Item item) {
		  itemRepository.save(item);
	  }

	  @PostMapping("/cart")
	  public void createCart(@RequestBody Cart cart){

	    cartRepository.save(cart);

	  }


	  @GetMapping("/cart")
	  public ResponseEntity<List<Cart>> getAllCarts(){

	    return  new ResponseEntity(cartRepository.findAll(), HttpStatus.OK);

	  }
}
