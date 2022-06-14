package projektas.darbopasiulymai;

import javax.persistence.*;

@Entity
public class AppliedJobs
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private int id_user;
	private int id_offered_job;
	
	public AppliedJobs(int id, int id_user, int id_offered_job)
	{
		super();
		this.id = id;
		this.id_user = id_user;
		this.id_offered_job = id_offered_job;
	}

	public AppliedJobs()
	{
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_offered_job() {
		return id_offered_job;
	}

	public void setId_offered_job(int id_offered_job) {
		this.id_offered_job = id_offered_job;
	}
}
