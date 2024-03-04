package org.cibertec.edu.pe.interfaces;


import org.cibertec.edu.pe.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProducto extends JpaRepository<Productos, String> {

}
