package projektas.darbopasiulymai;

import java.util.List;
import javax.persistence.*;

@Entity
public class OfferedJobs
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String pav;
	
	public OfferedJobs(int id, String pav) {
		super();
		this.id = id;
		this.pav = pav;
	}
	
	public OfferedJobs() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}
}
