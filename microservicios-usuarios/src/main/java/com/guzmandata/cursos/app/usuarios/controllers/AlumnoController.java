package com.guzmandata.cursos.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.guzmandata.cursos.app.commons.controllers.CommonController;
import com.guzmandata.cursos.app.usuarios.models.entity.Alumno;
import com.guzmandata.cursos.app.usuarios.services.AlumnoService;

@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {

		Optional<Alumno> optional = service.findById(id);

		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Alumno alumnoDb = optional.get();
		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumno.getApellido());
		alumnoDb.setEmail(alumno.getEmail());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDb));

	}

}
