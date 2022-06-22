package projektas.darbopasiulymai;

import java.util.Optional;

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
		model.addAttribute("darbai", offered_job_repository.findAll());
		
		return "darbai";
	}
	
	@RequestMapping(path="/aboutUs")
	public String apieMus()
	{
		return "aboutUs";
	}
	
	@RequestMapping(path="/employersRegister")
	public String uzsakovuRegistracija(Model model)
	{
		model.addAttribute("employer", new Employers());
		
		return "employersRegister";
	}
	
	@RequestMapping(path="/process_employer_register")
	public String processEmployerRegister(
			@RequestParam(name="pav", required=false, defaultValue="") String pav,
			@RequestParam(name="email", required=false, defaultValue="") String email,
			@RequestParam(name="telefono_nr", required=false, defaultValue="") String telefono_nr,
			@RequestParam(name="prideti_name", required=false, defaultValue="neprideti") String prideti,
			Model model)
	{
		Employers employer_application = new Employers();
		if(prideti.equals("prideti"))
		{
			employer_application.setPav(pav);
			employer_application.setEmail(email);
			employer_application.setTelefono_nr(telefono_nr);
			employer_application.setPatvirtinta(0);
			employer_repository.save(employer_application);
		}
		model.addAttribute("employers", employer_repository.findAll());
		
	    return "employerRegisterSuccess";
	}
	
	@RequestMapping(path="/employerRegisterSuccess")
	public String EmployerRegisterSuccess()
	{
		return "employerRegisterSuccess";
	}
}