package com.csutherland2020.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class HomeController {

	/*@Autowired
	MessageDao messageDao;
	*/
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homeGet(ModelMap model){
		
		/*List<Message> messages = messageDao.getMessages();
		model.put("messages", messages);*/
		return "app/home";
		
	}
	@RequestMapping(value="/home/{messageId}", method=RequestMethod.GET)
	public String homeGetByMessageId(@PathVariable("messageId") Long messageId, ModelMap model){
		
		/*Message messageById = messageDao.getMessageById(messageId);
		List<Message> messages = new ArrayList<Message>();
		messages.add(messageById);
		model.put("messages", messages);*/
		return "app/home";
		
	}
}
