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
