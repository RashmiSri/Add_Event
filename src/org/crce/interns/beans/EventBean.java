package org.crce.interns.beans;
import java.util.Date;

import org.crce.interns.model.Interview;
//import org.springframework.beans.factory.annotation.Autowired;

//import org.crce.interns.model.Interview;

public class EventBean {

	private int event_id;
	private int company_id;
	private boolean approved;
	private Date date;
	private Long time;
	private String venue;
	private String event_type;
	private Interview interview;
	//@Autowired
	//private InterviewBean interviewBean;
	//private Object event_type_object;
	
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
	/*public InterviewBean getInterviewBean() {
		return interviewBean;
	}
	public void setInterviewBean(InterviewBean interviewBean) {
		this.interviewBean = interviewBean;
	}*/
	public Interview getInterview() {
		return interview;
	}
	public void setInterview(Interview interview) {
		this.interview = interview;
	}	


}
