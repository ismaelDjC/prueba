package com.apecs.factura.apecs.controller;
import java.util.List;

import com.apecs.factura.apecs.models.Detalle;
import com.apecs.factura.apecs.repository.Detalle_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/detalle")
public class DetalleController {

    @Autowired
	private Detalle_Repository repository;

    @GetMapping("/")
	public List<Detalle> readAll() {
		return repository.findAll();
	}

	@PostMapping("/detalle")
	public Detalle create(@Validated @RequestBody Detalle l) {
		return repository.save(l);
	}

	@PutMapping("/detalle/{id}")
	public Detalle update(@PathVariable Integer id, @Validated @RequestBody Detalle l) {
		return repository.save(l);
	}

	@DeleteMapping("/detalle/{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
    
}
