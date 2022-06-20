package projektas.darbopasiulymai;

import java.util.List;
import javax.persistence.*;

@Entity
public class OfferedJobs
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private int employer_id;
	private int job_id;
	private String required_experience;
	private String text;
	
	@ManyToOne
    @JoinColumn(name="employer_id", referencedColumnName="id", insertable=false, updatable=false)    
	private Employers employer;
	
	@ManyToOne
    @JoinColumn(name="job_id", referencedColumnName="id", insertable=false, updatable=false)    
	private Job job;
	
	public OfferedJobs(int id, int employer_id, int job_id, String required_experience, String text)
	{
		super();
		this.id = id;
		this.employer_id = employer_id;
		this.job_id = job_id;
		this.required_experience = required_experience;
		this.text = text;
	}
	
	public OfferedJobs()
	{
		super();
	}
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Employers getEmployer() {
		return employer;
	}

	public void setEmployer(Employers employer) {
		this.employer = employer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployer_id() {
		return employer_id;
	}

	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public String getRequired_experience() {
		return required_experience;
	}

	public void setRequired_experience(String required_experience) {
		this.required_experience = required_experience;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
