package org.crce.interns.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Map;

import org.crce.interns.beans.AptitudeBean;
import org.crce.interns.beans.EventBean;
import org.crce.interns.beans.InterviewBean;
import org.crce.interns.beans.Pre_PlacementBean;
import org.crce.interns.beans.TrainingBean;
import org.crce.interns.service.EventDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventDetailsController {

	@Autowired
	private EventDetailsService eventDetailsService;
	
	@RequestMapping(value="/getForm.html", method=RequestMethod.GET)
	public ModelAndView getEventForm(){
		ModelAndView model=new ModelAndView("fill-events");
		return model;
	}
	
	@RequestMapping(value="fill", method=RequestMethod.POST)
	public ModelAndView createEvent(@RequestParam Map<String, String> map) throws ParseException{
		
		
		// initialize event bean
		EventBean eventBean=new EventBean();
		
		// set  event bean
		eventBean.setEvent_id(3);
		
		//eventBean.setEvent_id(Integer.parseInt(map.get("event_id")));
		//was returning null from the form, thus hard coded
		
		eventBean.setEvent_type(map.get("event_type"));
		eventBean.setCompany_id(Integer.parseInt(map.get("company_id")));
		eventBean.setApproved(Boolean.parseBoolean(map.get("approved")));
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		eventBean.setDate(formatter.parse(map.get("date")));
		eventBean.setTime(Long.parseLong(map.get("time")));
		eventBean.setVenue(map.get("venue"));
		eventDetailsService.create(eventBean);
		
		//create event-type beans--
		
		if(eventBean.getEvent_type().equals("aptitude")){
			//initialize aptitude bean
			AptitudeBean aptitudeBean=new AptitudeBean();
			
			//set bean
			aptitudeBean.setEvent_id(eventBean.getEvent_id());
			aptitudeBean.setSubjects_to_be_prepared(map.get("subjects_to_be_prepared"));
			aptitudeBean.setTest_duration(Long.parseLong(map.get("test_duration")));
			aptitudeBean.setTest_section(map.get("test_section"));
			//eventBean.setEvent_type_object(aptitudeBean);
			
			eventDetailsService.create(aptitudeBean);
		}
		else if(eventBean.getEvent_type().equals("interview")){
			
			InterviewBean interviewBean=new InterviewBean();
			interviewBean.setEvent_id(eventBean.getEvent_id());
			interviewBean.setInterview_type(map.get("interview_type"));
			//eventBean.setEvent_type_object(interviewBean);
		//eventBean.setInterviewBean(interviewBean);
			eventDetailsService.create(interviewBean);
		}
		else if(eventBean.getEvent_type().equals("training")){
			TrainingBean trainingBean=new TrainingBean();
			trainingBean.setAgenda(map.get("agenda"));
			trainingBean.setConducted_by(map.get("conducted_by"));
			trainingBean.setEvent_id(eventBean.getEvent_id());
			//eventBean.setEvent_type_object(trainingBean);
			eventDetailsService.create(trainingBean);
		}
		else if(eventBean.getEvent_type().equals("pre_placement")){
			Pre_PlacementBean pre_placementBean=new Pre_PlacementBean();
			pre_placementBean.setAgenda(map.get("agenda"));
			pre_placementBean.setConducted_by(map.get("conducted_by"));
			pre_placementBean.setEvent_id(eventBean.getEvent_id());
			//eventBean.setEvent_type_object(pre_placementBean);
			eventDetailsService.create(pre_placementBean);
		}
		
		//System.out.println(eventBean.getEvent_id());
		System.out.println(eventBean.getEvent_type());

		ModelAndView model=new ModelAndView("success");
		return model;
	}
	
}
