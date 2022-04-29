package com.apecs.factura.apecs.controller;

import java.util.List;

import com.apecs.factura.apecs.models.Proveedor;
import com.apecs.factura.apecs.repository.Proveedor_Repository;

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
@RequestMapping("/api/providers")
public class ProveerdorController {
    @Autowired
	private Proveedor_Repository repository;


    @GetMapping("/")
	public List<Proveedor> readAll() {
		return repository.findAll();
	}

	@PostMapping("/supplier")
	public Proveedor create(@Validated @RequestBody Proveedor p) {
		return repository.save(p);
	}

	@PutMapping("/supplier/{id}")
	public Proveedor update(@PathVariable Integer id, @Validated @RequestBody Proveedor p) {
		return repository.save(p);
	}

	@DeleteMapping("/supplier/{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
