package projektas.darbopasiulymai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController
{
	@Autowired
	private UserRepository user_repository;
	
	@RequestMapping(path="/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(path="/register")
	public String registration(Model model)
	{
		model.addAttribute("user", new User());
		
		return "register";
	}
	
	@RequestMapping(path="/process_register")
	public String processRegister(User user)
	{
	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(user.getPassword());
	    user.setPassword(encodedPassword);
	     
	    user_repository.save(user);
	     
	    return "register";
	}
}