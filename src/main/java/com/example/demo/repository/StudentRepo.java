package com.example.demo.repository;

import org.springframework.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface StudentRepo extends JpaRepository<Studententity,Long>{

}