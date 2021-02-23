package com.pe.qbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pe.qbo.model.Participante;
import com.pe.qbo.repository.ParticipanteRepository;

@RestController
@RequestMapping("/api/v1")
public class ParticipanteController {
	
	@Autowired
	private ParticipanteRepository participanteRepository;
	
	@GetMapping("/listarParticipantes")
	public List<Participante> listarParticipantes(){
		return participanteRepository.findAll();
	}
	
	@PostMapping("/registrarParticipante")
	public Participante crearCurso(@RequestBody Participante curso) {
		return participanteRepository.save(curso);
	}
	

}
