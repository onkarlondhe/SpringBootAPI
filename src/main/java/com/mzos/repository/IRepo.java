package com.mzos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mzos.bean.Product;

public interface IRepo extends JpaRepository<Product, Integer> {

 }