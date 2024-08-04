package com.agendamento.projetoagendamento.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendamento.projetoagendamento.entidades.Colaborador;

@RestController
@RequestMapping(value = "/colaboradores")
public class RecursoColaborador {
	
	@GetMapping
	public ResponseEntity<Colaborador> todoscolaboradores(){
		Colaborador c = new Colaborador(1L,"Marcos","Porteiro","99445566");
		return ResponseEntity.ok().body(c);
	}

}
