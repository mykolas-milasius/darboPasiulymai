package projektas.darbopasiulymai;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class loginController
{
	@RequestMapping("/login")
	public String login(Model model)
	{		
		return "login";
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
}