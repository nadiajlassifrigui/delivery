package tn.csf.delivery.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.delivery.model.Restaurant;
import tn.csf.delivery.repository.RestaurantRepository;




//defining the business logic  
@Service 

public class RestaurantService {
	
	@Autowired  
	RestaurantRepository rR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	  
	public List<Restaurant> getAllRestaurants()   
	{  
		List<Restaurant> restaurants = new ArrayList<Restaurant>();  
		rR.findAll().forEach(c -> restaurants.add(c));  
		return restaurants;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getRestaurantById(int id)   
	{  
		return rR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant restaurants)   
	{  
		rR.save(restaurants);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		rR.deleteById(id);  
	} 

}
