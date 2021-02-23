package com.pe.qbo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Participante")
public class Participante implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IdParticipante", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idparticipante;
	
	@Column(name = "NomParticipante", nullable = true)
	private String nomparticipante;
	
	@Column(name = "EdadParticipante", nullable = true)
	private int edadparticipante;

	public Participante() {
		
	}

	public Participante(long idparticipante, String nomparticipante, int edadparticipante) {
		super();
		this.idparticipante = idparticipante;
		this.nomparticipante = nomparticipante;
		this.edadparticipante = edadparticipante;
	}

	public long getIdparticipante() {
		return idparticipante;
	}

	public void setIdparticipante(long idparticipante) {
		this.idparticipante = idparticipante;
	}

	public String getNomparticipante() {
		return nomparticipante;
	}

	public void setNomparticipante(String nomparticipante) {
		this.nomparticipante = nomparticipante;
	}

	public int getEdadparticipante() {
		return edadparticipante;
	}

	public void setEdadparticipante(int edadparticipante) {
		this.edadparticipante = edadparticipante;
	}
	
}
