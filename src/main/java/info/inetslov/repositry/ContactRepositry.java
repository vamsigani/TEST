package info.inetslov.repositry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import info.inetslov.entity.Contact;

public interface ContactRepositry extends JpaRepository<Contact, Serializable> {
	


}
