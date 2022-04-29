package com.apecs.factura.apecs.controller;

import java.util.List;

import com.apecs.factura.apecs.models.Inventario;
import com.apecs.factura.apecs.repository.Inventario_Repository;

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
@RequestMapping("/api/inventories")
public class InventarioController {
    @Autowired
	private Inventario_Repository repository;


    @GetMapping("/")
	public List<Inventario> readAll() {
		return repository.findAll();
	}

	@PostMapping("/inventory")
	public Inventario create(@Validated @RequestBody Inventario l) {
		return repository.save(l);
	}

	@PutMapping("/inventory/{id}")
	public Inventario update(@PathVariable Integer id, @Validated @RequestBody Inventario l) {
		return repository.save(l);
	}

	@DeleteMapping("/inventory/{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
