package com.apecs.factura.apecs.controller;

import java.util.List;

import com.apecs.factura.apecs.models.Factura;
import com.apecs.factura.apecs.repository.Factura_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/factura")
public class FacturaController {

    @Autowired
    private Factura_Repository  repository;

    @GetMapping("/")
	public List<Factura> readAll() {
		return repository.findAll();
	}

	@PostMapping("/factura")
	public Factura create(@Validated @RequestBody Factura l) {
		return repository.save(l);
	}

	@PutMapping("/factura/{id}")
	public Factura update(@PathVariable Integer id, @Validated @RequestBody Factura l) {
		return repository.save(l);
	}

	@DeleteMapping("/factura/{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}



    
    
}
