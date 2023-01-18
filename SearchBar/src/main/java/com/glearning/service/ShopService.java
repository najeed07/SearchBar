package com.glearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.model.Shop;
import com.glearning.repository.ShopRepository;
@Service
public class ShopService {
 @Autowired
 private ShopRepository repository;
 
 /*
  * TODO: Get the List of Shops
  */
 public List<Shop> getAllShops(){
  List<Shop> list =  (List<Shop>)repository.findAll();
  return list;
 }
 
 /*
  * TODO: Get Shop By keyword
  */
 public List<Shop> getByKeyword(String keyword){
  return repository.findByKeyword(keyword);
 }
}
