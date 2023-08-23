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

import tn.csf.delivery.service.PlatService;
import tn.csf.delivery.model.Plat;
 





//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class PlatController {
	//autowire the PlatService class  
		@Autowired  
		PlatService ps;  

		//creating a get mapping that retrieves all the Plat detail from the database   
		@GetMapping("/plat")
		private List<Plat> getAllPlats()   
		{  
			return ps.getAllPlats();  
		}  

		//creating a get mapping that retrieves the detail of a specific plat  
		@GetMapping("/plat/{id}")  
		private Plat getPlat(@PathVariable("id") int id)   
		{  
			return ps.getPlatsById(id);  
		}  

		//creating a delete mapping that deletes a specified plat  
		@DeleteMapping("/plat/{id}")  
		private void deletePlat(@PathVariable("id") int id)   
		{  
			ps.delete(id);  
		} 

		//create new plat
		@PostMapping("/plat")  
		private int savePlat(@RequestBody Plat p)   
		{  
			ps.saveOrUpdate(p);  
			return p.getId();  
		} 

		//creating put mapping that updates the plat detail
		@PutMapping("/plat")  
		private Plat update(@RequestBody  Plat p)   
		{  
			ps.saveOrUpdate(p);  
			return p;  
		}  
		@GetMapping("/platsByRestaurant/{idrestaurant}")
		private List<Plat> getAllPlatsByIdrestaurant(@PathVariable("idrestaurant") int idrestaurant)   
		{  
			return ps.getAllPlatsByIdrestaurant(idrestaurant);  
		}  
	}


	


