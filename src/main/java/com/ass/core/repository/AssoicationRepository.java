package com.ass.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ass.core.dto.CapUpdate;
import com.ass.core.entity.Brand;
import com.ass.core.entity.Captain;
import com.ass.core.entity.Flight;
import com.ass.core.entity.Team;
import com.ass.core.util.SessionFactoryUtil;

public class AssoicationRepository {

	public void saveTeamDetails(Team team) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(team);
		transaction.commit();
	}

	public Captain findCapid(long id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(Captain.class, id);

	}
	
	public void updateCapDetails(CapUpdate capUpdate) {
		 Captain updateCap = findCapid(capUpdate.getId());
		 if(updateCap != null) {
			 updateCap.setCaptainName(capUpdate.getName());
			 updateCap.setAge(capUpdate.getAge());
			 SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
			 Session session = sessionFactory.openSession();
			 Transaction transaction = session.beginTransaction();
			 session.update(updateCap);
			 transaction.commit();
		 }
	}

	public void saveFlightDetails(Flight flight) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(flight);
		transaction.commit();
	}

	public void saveBrandDetails(Brand brand) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(brand);
		transaction.commit();
	}

}
