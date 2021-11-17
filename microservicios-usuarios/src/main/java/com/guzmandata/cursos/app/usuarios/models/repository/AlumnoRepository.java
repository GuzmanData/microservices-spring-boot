package com.guzmandata.cursos.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.guzmandata.cursos.app.usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	

}
