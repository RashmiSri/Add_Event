package org.crce.interns.dao;
/*import org.crce.interns.beans.AptitudeBean;
import org.crce.interns.beans.EventBean;
import org.crce.interns.beans.InterviewBean;
import org.crce.interns.beans.Pre_PlacementBean;
import org.crce.interns.beans.TrainingBean;
*/
import org.crce.interns.model.Aptitude;
import org.crce.interns.model.Event;
import org.crce.interns.model.Interview;
import org.crce.interns.model.Pre_Placement;
import org.crce.interns.model.Training;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository("eventDetailsDao")
public class EventDetailsDao {
	@Autowired
	private SessionFactory sessionFactory;
	Session session=null;
	Transaction tx=null;
	public void create(Event event){
		//System.out.println(event.getEvent_id());
		System.out.println(event.getEvent_type());

		//Session s=new Session();
		session=this.sessionFactory.openSession();
		tx=session.beginTransaction();
		session.save(event);
		tx.commit();
		//sessionFactory.getCurrentSession().save(event);
	}
	
	public void create(Training bean){
		//sessionFactory.getCurrentSession().save(bean);
		session=this.sessionFactory.openSession();
		tx=session.beginTransaction();
		//session.save(event);
		session.save(bean);
		
		tx.commit();

	}
	
	public void create(Aptitude bean){
		//sessionFactory.getCurrentSession().save(bean);
		session=this.sessionFactory.openSession();
		tx=session.beginTransaction();
		//session.save(event);
		session.save(bean);
		
		tx.commit();

	}
	
	public void create(Pre_Placement bean){
		session=this.sessionFactory.openSession();
		tx=session.beginTransaction();
		//session.save(event);
		session.save(bean);
		
		tx.commit();

		//sessionFactory.getCurrentSession().save(bean);
	}
	
	public void create(Interview bean){
		session=this.sessionFactory.openSession();
		tx=session.beginTransaction();
		//session.save(event);
		session.save(bean);
		
		tx.commit();

		//sessionFactory.getCurrentSession().save(bean);
	}
	
	
	/*public void createEvent(Event event,Training training,Pre_Placement pp,Aptitude apt,Interview interview){
		
		
		
		
		sessionFactory.getCurrentSession().save(event);
		
		if(training!=null){
			training.setEvent_id(event.getEvent_id());
			sessionFactory.getCurrentSession().save(training);
		}
		else if(pp!=null){
			pp.setEvent_id(event.getEvent_id());
			sessionFactory.getCurrentSession().save(pp);
		}
		else if(apt!=null){
			apt.setEvent_id(event.getEvent_id());
			sessionFactory.getCurrentSession().save(apt);
		}
		else if(interview!=null){
			interview.setEvent_id(event.getEvent_id());
			sessionFactory.getCurrentSession().save(interview);
		}
		
		}
*/}
