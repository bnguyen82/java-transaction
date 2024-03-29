package net.viralpatel.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.viralpatel.contact.dao.ContactDAO;
import net.viralpatel.contact.form.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;

	@Transactional(isolation=Isolation.SERIALIZABLE)
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
		listContact();
	}

	@Transactional(isolation=Isolation.SERIALIZABLE)
	public List<Contact> listContact() {

		return contactDAO.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
	}
}
