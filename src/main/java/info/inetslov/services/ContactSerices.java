package info.inetslov.services;

import java.util.List;

import info.inetslov.entity.Contact;

public interface ContactSerices {
	
	public boolean save(Contact contact);
	public List<Contact> getallDetails();
	public boolean update(Contact contact);
	public boolean deleteById(Integer contactId);
	public Contact getContactById(Integer contactId);

}
