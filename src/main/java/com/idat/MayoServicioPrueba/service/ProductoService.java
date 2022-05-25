package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoService {
	
	void guardarProducto(Productos producto);	
	void actualizaProductos(Productos producto);	
	void eliminarProducto(Integer id);	
	List<Productos> listarProductos();
	Productos obtenerProducto(Integer id);

}
