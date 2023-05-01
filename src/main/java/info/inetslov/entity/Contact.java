package info.inetslov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "CONTACT_TBL")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_NUMBER")
	private Long contactnumber;
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name="ACTIVE_SW")
	private String activeSw;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactnumber=" + contactnumber
				+ ", contactEmail=" + contactEmail + ", activeSw=" + activeSw + "]";
	}
	

	
	
	
}
