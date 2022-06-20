package projektas.darbopasiulymai;

import java.util.List;

import javax.persistence.*;

@Entity
public class EmployerApplications
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private String pav;
	private String email;
	private String telefono_nr;
	
	public EmployerApplications()
	{
		super();
	}
	
	public EmployerApplications(Integer id, String pav, String email, String telefono_nr)
	{
		super();
		this.id = id;
		this.pav = pav;
		this.email = email;
		this.telefono_nr = telefono_nr;
	}

	public long getId() {
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
}
