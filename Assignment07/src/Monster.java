public class Monster {
	private String name;
	private int health;
	private Weapon weapon;
	Monster(String name,int health,Weapon weapon){
		this.name = name;
		this.health =health;
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getWeaponName() {
	return weapon.name;
}
	public int attack(Monster a) {
		double c = Math.random()*Weapon.DamageMax;
		int d = (int) c;
		health -= d;
		return d;
		}
	}