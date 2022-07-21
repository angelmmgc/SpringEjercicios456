package com.example.Ejercicios456.model;

import com.example.Ejercicios456.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepoitory extends JpaRepository<Laptop, Long> {
}
