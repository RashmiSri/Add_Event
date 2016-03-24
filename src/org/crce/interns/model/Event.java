package org.crce.interns.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
import com.sun.istack.internal.NotNull;

@Entity
@Table(name="Event")
public class Event {
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "event_id", nullable = false)
	@NotNull
	private int event_id;
	
	@Column(name="company_id")
	private int company_id;
	
	@Column(name="approved")
	private boolean approved;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="time")
	private Long time;
	
	@Column(name="venue")
	private String venue;
	
	@Column(name="event_type")
	private String event_type;
	
	//@OneToOne
	//private Interview interview;
	
	/*public Interview getInterview() {
		return interview;
	}
	public void setInterview(Interview interview) {
		this.interview = interview;
	}*/
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	
	
}
