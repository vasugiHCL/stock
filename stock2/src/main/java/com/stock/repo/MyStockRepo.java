package com.stock.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entity.MyStock;

@Repository
public interface MyStockRepo extends JpaRepository<MyStock, Long>{

}
