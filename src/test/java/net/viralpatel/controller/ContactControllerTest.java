package net.viralpatel.controller;

import net.viralpatel.contact.service.ContactService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ContactControllerTest {

	@Autowired
	private ContactService contactService;
	@Test
	public void testlistContacts(){

	}
}
