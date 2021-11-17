package com.guzmandata.cursos.app.commons.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.guzmandata.cursos.app.commons.services.CommonService;

public class CommonController<E, S extends CommonService<E>> {

	@Autowired
	protected S service;

	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {

		Optional<E> optional = service.findById(id);

		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(optional.get());
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody E entity) {

		E entitydb = service.save(entity);

		return ResponseEntity.status(HttpStatus.CREATED).body(entitydb);
	}

	@DeleteMapping("/{id")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {

		service.deleteById(id);

		return ResponseEntity.noContent().build();
	}

}
