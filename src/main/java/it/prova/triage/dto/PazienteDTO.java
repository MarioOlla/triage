package it.prova.triage.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import it.prova.triage.model.Paziente;
import it.prova.triage.model.StatoPaziente;

public class PazienteDTO {

	private Long id;
	@NotBlank(message = "{nome.notblank}")
	private String nome;
	@NotBlank(message = "{cognome.notblank}")
	private String cognome;
	@NotBlank(message = "{codiceFiscale.notblank}")
	private String codiceFiscale;
	private LocalDate dataRegistrazione;
	private StatoPaziente stato;

	public PazienteDTO(Long id, String nome, String cognome, String codiceFiscale, LocalDate dataRegistrazione,
			StatoPaziente stato) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.dataRegistrazione = dataRegistrazione;
		this.stato = stato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public LocalDate getDataRegistrazione() {
		return dataRegistrazione;
	}

	public void setDataRegistrazione(LocalDate dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}

	public StatoPaziente getStato() {
		return stato;
	}

	public void setStato(StatoPaziente stato) {
		this.stato = stato;
	}

	public Paziente buildPazienteModel() {
		return new Paziente(this.id, this.nome, this.cognome, this.codiceFiscale, this.dataRegistrazione, this.stato);
	}
	
	public static PazienteDTO buildDTOFromPazienteModel(Paziente model) {
		return new PazienteDTO(model.getId(), model.getNome(), model.getCognome(),model.getCodiceFiscale(), model.getDataRegistrazione(),model.getStato());
	}
}
