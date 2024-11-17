package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Inventory;
import com.example.demo.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	InventoryService inventoryService;
	
	@GetMapping("/getall")
	public List<Inventory> getallInventories(){
		return inventoryService.getallInventories();
	}
	
	@GetMapping("/getid/{id}")
	public Optional<Inventory> getInventoriesbyId(@PathVariable int id){
		return inventoryService.getInventoriesbyId(id);
	}
	
	@PostMapping("/create")
	public void createInventory(@RequestBody Inventory obj) {
		inventoryService.createInventory(obj);
	}
	
	@PutMapping("/update")
	public void updateInventory(@RequestBody Inventory obj2) {
		inventoryService.updateInventory(obj2);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteInventory(@PathVariable int id) {
		inventoryService.deleteInventory(id);
	}
}
