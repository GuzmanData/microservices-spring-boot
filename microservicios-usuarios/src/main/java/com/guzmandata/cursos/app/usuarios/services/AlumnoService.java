package com.guzmandata.cursos.app.usuarios.services;

import java.util.List;

import com.guzmandata.cursos.app.commons.services.CommonService;
import com.guzmandata.cursos.commons.alumnos.model.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{
	
	public List<Alumno> findByNombreOrApellido(String term);

}
