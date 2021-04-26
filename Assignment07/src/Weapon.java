public class Weapon {
	String name = "Sharp Stick";
	static int DamageMax = 2;
public Weapon(String name,int DamageMax){
	this.name = name;
	this.DamageMax = DamageMax;
}
public String getName() {
	return name;
}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamageMax() {
		return DamageMax;
	}
	public void setDamageMax(int DamageMax) {
		this.DamageMax = DamageMax;
	}
}
