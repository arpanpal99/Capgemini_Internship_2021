package com.capgemini.lesson1_hibernate_telusko.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="entity_alien")
@Table(name="alien_table")
public class Alien {

	@Id
	private int aid;
	private AlienName name;
	@Column(name="alien_color")
	private String color;
	@Transient				//This wont be added as a column in the database
	private String aplanet;
	
	public Alien(int aid, AlienName name, String color, String aplanet) {
		super();
		this.aid = aid;
		this.name = name;
		this.color = color;
		this.aplanet = aplanet;
	}
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAid() {
		return aid;
	}
	public AlienName getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getAplanet() {
		return aplanet;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setName(AlienName name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setAplanet(String aplanet) {
		this.aplanet = aplanet;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", color=" + color + ", aplanet=" + aplanet + "]";
	}
		
}
