package p113;

public class Sword {
	private String name;

	public Sword()
	{
		name = "noname";
	}
	public Sword(String name)
	{
		setName(name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
