package com.lusan.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lusan.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
