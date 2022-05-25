package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepository;


@Service
public class ProductosServiceImpl implements ProductoService {
	
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub	
		repository.guardarProducto(producto);

	}

	@Override
	public void actualizaProductos(Productos producto) {
		// TODO Auto-generated method stub
		repository.actualizaProductos(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.eliminarProducto(id);
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return repository.listarProductos();
	}

	@Override
	public Productos obtenerProducto(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtenerProducto(id);
	}

}
