package projektas.darbopasiulymai;

import java.util.List;
import javax.persistence.*;

@Entity
public class Job
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	private String pav;
	
	public Job()
	{
		super();
	}

	public Job(long id, String pav)
	{
		super();
		this.id = id;
		this.pav = pav;
	}
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="job_id", referencedColumnName="id", insertable=false, updatable=false)    
    private List<OfferedJobs> offered_job;
    
	public List<OfferedJobs> getOffered_job() {
		return offered_job;
	}

	public void setOffered_job(List<OfferedJobs> offered_job) {
		this.offered_job = offered_job;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}
}
