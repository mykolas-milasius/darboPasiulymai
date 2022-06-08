package projektas.darbopasiulymai;

public class Job
{
	private long id;
	private String pav;
	private int patirtis;
	
	public Job()
	{
		super();
	}

	public Job(long id, String pav, int patirtis)
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

	public int getPatirtis() {
		return patirtis;
	}

	public void setPatirtis(int patirtis) {
		this.patirtis = patirtis;
	}
}
