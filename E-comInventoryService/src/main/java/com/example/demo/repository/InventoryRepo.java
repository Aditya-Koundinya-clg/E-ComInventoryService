package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

}
