package com.example.demo;

//import java.security.Provider.Services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.TechEntity;
//import com.example.demo.Services;
//import com.example.demo.Service.RecipeService;


@RestController
@CrossOrigin(origins = "http://localhost:3000") 

public class Controller {

	@Autowired
	private Services Sserve;
	
	@PostMapping("/tech")
	public TechEntity postRecipes(@RequestBody TechEntity r)
	{
		return Sserve.addRecipes(r);
	}
	
	@GetMapping("/show")
	@CrossOrigin(origins = "http://localhost:3000")
	public List<TechEntity> showRecipes()
	{
		List<TechEntity> a = new ArrayList<>();
		a = Sserve.getRecipes();
		return a;
	}
	
//	@DeleteMapping ("/delete/{id}")
//	public void delete(@PathVariable("id") int id) {
//		Sserve.deleteDepartmentById(id);
//	}
//	@PutMapping("/update/{id}")
//      public  CusEntity  update(@PathVariable int id,@RequestBody CusEntity s) {
//    	  return Sserve.update(id, s);
//      }
	
}