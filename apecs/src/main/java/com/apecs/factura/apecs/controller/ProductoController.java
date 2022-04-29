package com.apecs.factura.apecs.controller;

import java.util.List;

import com.apecs.factura.apecs.models.Producto;
import com.apecs.factura.apecs.repository.Producto_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductoController {
    @Autowired
	private Producto_Repository repository;

    @GetMapping("/")
	public List<Producto> readAll() {
		return repository.findAll();
	}

	@PostMapping("/product")
	public Producto create(@Validated @RequestBody Producto p) {
		return repository.save(p);
	}

	@PutMapping("/product/{id}")
	public Producto update(@PathVariable Integer id, @Validated @RequestBody Producto p) {
		return repository.save(p);
	}

	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
