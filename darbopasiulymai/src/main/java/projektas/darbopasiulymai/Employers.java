package projektas.darbopasiulymai;

import java.util.List;

import javax.persistence.*;

@Entity
public class Employers
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private String pav;
	private String email;
	private String telefono_nr;
	private int patvirtinta;
	
	public Employers()
	{
		//super();
	}
	
	public Employers(Integer id, String pav, String email, String telefono_nr, int patvirtinta)
	{
		super();
		this.id = id;
		this.pav = pav;
		this.email = email;
		this.telefono_nr = telefono_nr;
		this.patvirtinta = patvirtinta;
	}

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="employer_id", referencedColumnName="id", insertable=false, updatable=false)    
    private List<OfferedJobs> offered_job;
    
	public List<OfferedJobs> getOffered_job() {
		return offered_job;
	}

	public void setOffered_job(List<OfferedJobs> offered_job) {
		this.offered_job = offered_job;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono_nr() {
		return telefono_nr;
	}

	public void setTelefono_nr(String telefono_nr) {
		this.telefono_nr = telefono_nr;
	}

	public int getPatvirtinta() {
		return patvirtinta;
	}

	public void setPatvirtinta(int patvirtinta) {
		this.patvirtinta = patvirtinta;
	}
}
