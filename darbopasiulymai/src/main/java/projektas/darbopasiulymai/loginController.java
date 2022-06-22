package projektas.darbopasiulymai;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class loginController
{
	@RequestMapping("/customLogin")
	public String login_c(Model model)
	{		
		return "customLogin";
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/login")
	public String login(Model model)
	{		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(Model model)
	{
		return "redirect:login";
	}
}