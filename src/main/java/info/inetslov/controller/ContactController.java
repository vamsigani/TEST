package info.inetslov.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.inetslov.entity.Contact;
import info.inetslov.services.ContactSerices;

@Controller
public class ContactController {
	@Autowired
	private ContactSerices contactservices;

	@GetMapping("/loadForm")
	public String loadForm(Model model) {

		model.addAttribute("contact", new Contact());
		return "index";
	}

	@PostMapping("/save")
	public String saveForm(Contact contact, Model model) {

		boolean save = contactservices.save(contact);
		if (save) {
			model.addAttribute("sucess", "susessfully stored");
		} else {
			model.addAttribute("fail", "failed stored");
		}
		return "index";
	}

	@GetMapping("/view")
	public String Getalldetails(Model model) {

		List<Contact> getallDetails = contactservices.getallDetails();
		model.addAttribute("con", getallDetails);
		return "viewform";
	}

	@GetMapping("/edit")
	public String EditForm(@RequestParam("cid") Integer cid, Model model) {
		Contact contactById = contactservices.getContactById(cid);
		model.addAttribute("contact", contactById);
		model.addAttribute("ContactId", contactById);
		return "index";
	}

	@GetMapping("/delete")
	public String deleteform(@RequestParam("cid") Integer cid) {
		contactservices.deleteById(cid);
		return "redirect:/view";
	}

	@GetMapping("/View contcact")
	public String RetriveAllfvoidform() {
		contactservices.notifyAll();
		return "redirect";
	}

	@GetMapping("/View contcact")
	public String NotifiyForm() {
		contactservices.notifyAll();
		return "redirect";
	}

}
