package net.viralpatel.contact.core;

import org.springframework.orm.hibernate3.HibernateTransactionManager;

public class ExtendedHibernateTransactionManager extends
		HibernateTransactionManager {

	/**
	 *
	 */

	@Override
	public void afterPropertiesSet() {
		// TODO Auto-generated method stub
		super.afterPropertiesSet();
		logger.debug("Bao ngo");
	}

}
