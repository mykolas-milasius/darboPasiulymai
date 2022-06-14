package projektas.darbopasiulymai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController
{
	@Autowired
	private UserRepository user_repository;
	
	@Autowired
	private AppliedJobsRepository applied_jobs_repository;
	
	@Autowired
	private EmployersRepository employer_repository;
	
	@Autowired
	private JobRepository job_repository;
	
	@Autowired
	private OfferedJobsRepository offered_job_repository;
	
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
	
	@RequestMapping(path="/darbai")
	public String darbuWEB(Model model)
	{
		model.addAttribute("darbai", job_repository.findAll());
		//model.addAttribute("darbdaviai", employer_repository.findAll());
		//model.addAttribute("siulomi_darbai", offered_job_repository.findAll());
		
		return "darbai";
	}
	
	@RequestMapping(path="/aboutUs")
	public String apieMus()
	{
		return "aboutUs";
	}
	
	@RequestMapping(path="/employersRegister")
	public String uzsakovuRegistracija()
	{
		return "employersRegister";
	}
}