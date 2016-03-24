package org.crce.interns.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="training")
public class Training {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="event_id")
	private int event_id;
	@Column(name="conducted_by")
	private String conducted_by;
	@Column(name="agenda")
	private String agenda;
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getConducted_by() {
		return conducted_by;
	}
	public void setConducted_by(String conducted_by) {
		this.conducted_by = conducted_by;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
}
