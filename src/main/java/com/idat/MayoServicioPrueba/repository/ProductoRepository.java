package com.idat.MayoServicioPrueba.repository;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoRepository {
	
	void guardarProducto(Productos producto);
	
	void actualizaProductos(Productos producto);
	
	void eliminarProducto(Integer id);
	
	List<Productos> listarProductos();
	Productos obtenerProducto(Integer id);
	

}
