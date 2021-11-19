package com.guzmandata.cursos.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guzmandata.cursos.app.commons.services.CommonServiceImpl;
import com.guzmandata.cursos.app.usuarios.models.repository.AlumnoRepository;
import com.guzmandata.cursos.commons.alumnos.model.entity.Alumno;


@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		// TODO Auto-generated method stub
		return repository.findByNombreOrApellido(term);
	}

}
