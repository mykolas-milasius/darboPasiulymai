package projektas.darbopasiulymai;

public class Employer
{
	private long id;
	private String pav;
	private String email;
	private String telefono_numeris;
	
	public Employer()
	{
		super();
	}
	
	public Employer(long id, String pav, String email, String telefono_numeris)
	{
		super();
		this.id = id;
		this.pav = pav;
		this.email = email;
		this.telefono_numeris = telefono_numeris;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono_numeris() {
		return telefono_numeris;
	}

	public void setTelefono_numeris(String telefono_numeris) {
		this.telefono_numeris = telefono_numeris;
	}
}
