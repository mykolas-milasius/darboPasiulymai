package projektas.darbopasiulymai;

public class OfferedJob
{
	private long id;
	private String pav;
	private String patirtis;
	
	public OfferedJob()
	{
		super();
	}

	public OfferedJob(long id, String pav, String patirtis)
	{
		super();
		this.id = id;
		this.pav = pav;
		this.patirtis = patirtis;
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

	public String getPatirtis() {
		return patirtis;
	}

	public void setPatirtis(String patirtis) {
		this.patirtis = patirtis;
	}
}
