package com.ass.core.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.ass.core.entity.AirHosters;
import com.ass.core.entity.Brand;
import com.ass.core.entity.Captain;
import com.ass.core.entity.Flight;
import com.ass.core.entity.Product;
import com.ass.core.entity.Team;
import com.ass.core.entity.UserEntity;

public class SessionFactoryUtil {

	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		if (factory == null) {
			Configuration configuration = new Configuration();
			configuration.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//			configuration.addAnnotatedClass(UserEntity.class);
			
			configuration.addAnnotatedClass(Team.class);
			configuration.addAnnotatedClass(Captain.class);
			
//			configuration.addAnnotatedClass(Flight.class);
//			configuration.addAnnotatedClass(AirHosters.class);
			
//			configuration.addAnnotatedClass(Product.class);
//			configuration.addAnnotatedClass(Brand.class);
			
			factory = configuration.buildSessionFactory();
		}
		return factory;
	}

}
