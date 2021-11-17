package com.guzmandata.cursos.app.usuarios.services;

import org.springframework.stereotype.Service;
import com.guzmandata.cursos.app.commons.services.CommonServiceImpl;
import com.guzmandata.cursos.app.usuarios.models.entity.Alumno;
import com.guzmandata.cursos.app.usuarios.models.repository.AlumnoRepository;


@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

}
