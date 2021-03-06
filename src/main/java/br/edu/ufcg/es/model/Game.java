package br.edu.ufcg.es.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Game")
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String date;
	
	@Column
	private String local;
	
	@Column
	private String sport;
	
	@Column
	private String description;
	
	@Column
	private long idOwner;
	
	@Column
	private String name;

	@Column
	private ArrayList<Long> guests;
	
	@Column
	private ArrayList<Long> guestRequests;
	
	@Column
	private boolean finished;
	
	public Game(String date, String local, String sport, String description, String name){ // construtor normal
		this.date = date; 
		this.local = local;
		this.sport = sport;
		this.name = name;
		this.description = description;
		this.guests = new ArrayList<>(); // iniciam vazias
		this.guestRequests = new ArrayList<>();
		this.finished = false;
	}

	public Game(String date, String local, String sport, String description, long idOwner, String name){ // construtor passando 
		this.date = date;																	// o id e sem estrutura de dados
		this.local = local;
		this.sport = sport;
		this.description = description;
		this.idOwner = idOwner; // seta um idOwner passado como parametro
		this.guests = new ArrayList<>();
		this.guestRequests = new ArrayList<>();
		this.name = name;
		this.finished = false;
	}

	public Game(String date, String local, String sport, String description, long idOwner,
			ArrayList<Long> guests, ArrayList<Long> guestsRequests, String name, boolean finished){
		this.date = date;
		this.local = local;
		this.sport = sport;
		this.name = name;
		this.description = description;
		this.idOwner = idOwner; // seta idOwner
		this.guests = guests;
		this.guestRequests = guestsRequests;
		this.finished = finished;
	}
	
	public Game(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(long idOwner) {
		this.idOwner = idOwner;
	}

	public ArrayList<Long> getGuests() {
		return guests;
	}

	public void setGuests(ArrayList<Long> guests) {
		this.guests = guests;
	}
	
	public ArrayList<Long> getGuestsRequests() {
		return guestRequests;
	}

	public void setGuestRequests(ArrayList<Long> guestRequests) {
		this.guestRequests = guestRequests;
	}
	
	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
