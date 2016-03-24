package org.crce.interns.service;

import org.crce.interns.beans.AptitudeBean;
import org.crce.interns.beans.EventBean;
import org.crce.interns.beans.InterviewBean;
import org.crce.interns.beans.Pre_PlacementBean;
import org.crce.interns.beans.TrainingBean;
import org.crce.interns.dao.EventDetailsDao;
import org.crce.interns.model.Aptitude;
import org.crce.interns.model.Event;
import org.crce.interns.model.Interview;
import org.crce.interns.model.Pre_Placement;
import org.crce.interns.model.Training;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("eventDetailsService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class EventDetailsService {
	@Autowired
	private EventDetailsDao eventDetailsDao;
	
	public void create(EventBean eventBean){
		//System.out.println(eventBean.getEvent_id());
		System.out.println(eventBean.getEvent_type());
		Event event=new Event();
		BeanUtils.copyProperties(eventBean,event);
		//System.out.println(event.getEvent_id());
		System.out.println(event.getEvent_type());
		eventDetailsDao.create(event);
	}
	
	public void create(TrainingBean trainingBean){
		Training training=new Training();
		BeanUtils.copyProperties(trainingBean,training);
		//Event event=new Event();
		//BeanUtils.copyProperties(eventBean,event);

		eventDetailsDao.create(training);		
	}
	
	public void create(AptitudeBean aptitudeBean){
		Aptitude aptitude=new Aptitude();
		BeanUtils.copyProperties(aptitudeBean,aptitude);
	//	Event event=new Event();
		//BeanUtils.copyProperties(eventBean,event);

		eventDetailsDao.create(aptitude);
	}
	
	public void create(Pre_PlacementBean pre_placementBean){
		Pre_Placement pre_placement=new Pre_Placement();
		BeanUtils.copyProperties(pre_placementBean,pre_placement);
	//	Event event=new Event();
	//	BeanUtils.copyProperties(eventBean,event);

		eventDetailsDao.create(pre_placement);
 }
	
	public void create(InterviewBean interviewBean){
		Interview interview=new Interview();
		BeanUtils.copyProperties(interviewBean,interview);
		//Event event=new Event();
		//eventBean.setInterview(interview);
		//BeanUtils.copyProperties(eventBean,event);
		//event.setInterview(interview);
		eventDetailsDao.create(interview);
	}
	
	public void createEvent(Event event,Training training,Pre_Placement pp,Aptitude apt,Interview interview){
		//public void createEvent(Map map)
		//Event event=new Event();
		
		// copy from source to destination
		//BeanUtils.copyProperties(eventBean,event);
		
		
		eventDetailsDao.createEvent(event,training,pp,apt,interview);
	}

}
