package projektas.darbopasiulymai;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class loginController
{
	@RequestMapping("/customLogin")
	public String login(Model model)
	{		
		return "customLogin";
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
}