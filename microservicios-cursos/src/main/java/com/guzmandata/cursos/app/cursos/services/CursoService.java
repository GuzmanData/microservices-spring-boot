package com.guzmandata.cursos.app.cursos.services;

import com.guzmandata.cursos.app.commons.services.CommonService;
import com.guzmandata.cursos.app.cursos.models.entity.Curso;

public interface CursoService extends CommonService<Curso> {
	
	public Curso findCursoByAlumnoId(Long id);

}
