package tn.csf.delivery.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.delivery.model.Plat;
import tn.csf.delivery.repository.PlatRepository;





//defining the business logic  
@Service 

public class PlatService {

	@Autowired  
	PlatRepository pR;  
	
	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Plat> getAllPlats()   
	{  
		List<Plat> plats = new ArrayList<Plat>();  
		pR.findAll().forEach(p -> plats.add(p));  
		return plats;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Plat getPlatsById(int id)   
	{  
		return pR.findById(id).get();  
	}  
	public List<Plat> getAllPlatsByIdrestaurant(int idrestaurant)   
	{  
		
		return pR.findByIdrestaurant(idrestaurant);  	
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Plat plats)   
	{  
		pR.save(plats);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		pR.deleteById(id);  
	} 
}
