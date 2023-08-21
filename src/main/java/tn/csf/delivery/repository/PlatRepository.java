package tn.csf.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.delivery.model.Plat;




//repository that extends CrudRepository  


public interface PlatRepository extends CrudRepository<Plat, Integer>{ 

}
