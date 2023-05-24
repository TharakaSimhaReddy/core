package com.ass.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ass.core.dto.UserDto;
import com.ass.core.entity.UserEntity;
import com.ass.core.util.ConnectionPropertiesUtil;
import com.ass.core.util.SessionFactoryUtil;

public class UserRepository {

	public void saveOrUpdate(UserEntity userEntity) {

//		Configuration configuration = new Configuration();
//		configuration.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//		configuration.addAnnotatedClass(UserEntity.class);
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();

	}

	public UserEntity findById(long id) {
		Configuration configuration = new Configuration();
		configuration.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		configuration.addAnnotatedClass(UserEntity.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		UserEntity userEntity = session.get(UserEntity.class, id);
//		return userEntity;

		return session.get(UserEntity.class, id);
	}

	public void update(UserDto userDto) {
		UserEntity userEntity = findById(userDto.getAltKey());
		if (userEntity != null) {
			userEntity.setName(userDto.getName());
			userEntity.setCity(userDto.getCity());
			userEntity.setCountry(userDto.getCountry());
			userEntity.setPinCode(userDto.getPinCode());
			saveOrUpdate(userEntity);
			/*
			Configuration configuration = new Configuration();
			configuration.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			configuration.addAnnotatedClass(UserEntity.class);
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.merge(userEntity);
			transaction.commit();
			*/
		}
	}

	public void delete(long id) {
		
		UserEntity findById = findById(id);
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(findById);
		transaction.commit();

	}

}
