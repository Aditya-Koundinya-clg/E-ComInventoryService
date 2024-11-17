package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Inventory;
import com.example.demo.repository.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepo inventoryRepo;

	public List<Inventory> getallInventories(){
		return inventoryRepo.findAll();
	}
	
	public Optional<Inventory> getInventoriesbyId(int id){
		return inventoryRepo.findById(id);
	}
	
	public void createInventory(Inventory obj) {
		inventoryRepo.save(obj);
	}
	
	public void updateInventory(Inventory obj2) {
		inventoryRepo.save(obj2);
	}
	
	public void deleteInventory(int id) {
		inventoryRepo.deleteById(id);
	}
}
