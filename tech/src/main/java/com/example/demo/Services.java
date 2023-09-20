package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TechEntity;
import com.example.demo.Repo;



@Service

public class Services  {

	@Autowired
	private Repo repo;
	
	public TechEntity addRecipes(TechEntity obj)
	{
		return repo.save(obj);
	}
	
	public List<TechEntity> getRecipes()
	{
		List<TechEntity> arr=new ArrayList<>();
		arr=repo.findAll();
		return arr;
	}
//	
//	public void deleteDepartmentById(int id)
//    {
//   	 repo.deleteById(id);
//    }
//    
//  public  CusEntity update(int id,CusEntity s) {
//	   return repo.saveAndFlush(s);
//  }
}