package info.inetslov.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.inetslov.entity.Contact;
import info.inetslov.repositry.ContactRepositry;
@Service
public class ContactImpl implements ContactSerices {
	@Autowired
	private ContactRepositry contactrepo;

	@Override
	public boolean save(Contact contact) {
		
		//contact.setActiveSw("Y");
		Contact saved = contactrepo.save(contact);
		return saved.getContactId()!= null;
	}

	
	
	@Override
	public List<Contact> getallDetails() {
		return  contactrepo.findAll();
		
	}

	@Override
	public boolean update(Contact contact) {
		
		try
		{
			contactrepo.save(contact);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
		
		
	}

	
	

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = contactrepo.findById(contactId);
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deleteById(Integer contactId) {
		
		try {

			Contact contact = contactrepo.findById(contactId).get();
		contact.setActiveSw("N ");
			contactrepo.save(contact);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
	}

}
}
