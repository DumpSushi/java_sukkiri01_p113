package p113;

public class Hero {
	private String name;
	private int hp;
	private int mp;

	public Hero(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return "勇者(名前=" + this.name +
				"/HP=" + this.hp + "/MP=" + this.mp + ")";
	}
	public boolean equals(Object o)
	{
		if(o == this)
			return true;
		if(o == null)
			return false;
		if(!(o instanceof Hero))
			return false;
		Hero r = (Hero)o;
		if(r.name.equals(this.getName()))
			return true;
		return false;
	}
	public int hashCode()
	{
		int result = 37;
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;
		return result;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	int getMp() {
		return mp;
	}
	void setMp(int mp) {
		this.mp = mp;
	}

}
