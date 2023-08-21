package tn.csf.delivery.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.delivery.model.Restaurant;
import tn.csf.delivery.service.RestaurantService;



//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class RestaurantController {
	
	//autowire the Restaurantservice class  
		@Autowired  
		RestaurantService rS;  

		//creating a get mapping that retrieves all the restaurant detail from the database   
		@GetMapping("/restaurant")
		private List<Restaurant> getAllRestaurants()   
		{  
			return rS.getAllRestaurants();  
		}  

		//creating a get mapping that retrieves the detail of a specific restaurant  
		@GetMapping("/restaurant/{id}")  
		private Restaurant getRestaurant(@PathVariable("id") int id)   
		{  
			return rS.getRestaurantById(id);
		}  

		//creating a delete mapping that deletes a specified restaurant  
		@DeleteMapping("/restaurant/{id}")  
		private void deleteRestaurant(@PathVariable("id") int id)   
		{  
			rS.delete(id);  
		} 

		//create new restaurant
		@PostMapping("/restaurant")  
		private int saveRestaurant(@RequestBody Restaurant r)   
		{  
			rS.saveOrUpdate(r);  
			return r.getId();  
		} 

		//creating put mapping that updates the restaurant detail
		@PutMapping("/restaurant")  
		private Restaurant update(@RequestBody  Restaurant r)   
		{  
			rS.saveOrUpdate(r);  
			return r;  
		}  

}
