package it.uniroma3.diadia.personaggi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public abstract class AbstractPersonaggio {
	
	private String nome;
	private String presentazione;
	private boolean haSalutato;
	
	public AbstractPersonaggio(String nome, String presenta) {
		this.nome = nome;
		this.presentazione = presenta;
		this.haSalutato = false;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean haSalutato() {
		return this.haSalutato;
	}
	
	public String saluta() {
		StringBuilder risposta = new StringBuilder("Ciao, io sono ");
		risposta.append(this.getNome()+".");
		if(!haSalutato)
			risposta.append(this.presentazione);
		else
			risposta.append("Ci siamo già presentati!");
		this.haSalutato = true;
		return risposta.toString();
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
	
	abstract public String agisci(Partita partita);
	abstract public String riceviRegalo(Attrezzo attrezzo, Partita partita);
}
