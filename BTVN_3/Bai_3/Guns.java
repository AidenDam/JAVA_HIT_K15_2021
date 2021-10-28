import java.util.Random;

public class Guns
{
	private String weaponName;
	private int ammoNumber;

	Guns() {
		ammoNumber = 100;
	}

	public void load() {
		Random generator = new Random();
		int x = generator.nextInt(10) + 1;
		ammoNumber += x;
	}

	public void shoot() {
		Random generator = new Random();
		int x = generator.nextInt(10) + 1;
		ammoNumber -= x;
	}

	public String getWeaon() {
		return weaponName;
	}
	public int getAmmo() {
		return ammoNumber;
	}

	public void setWeaon(String name) {
		weaponName = name;
	}
	public void setAmmo(int n) {
		ammoNumber = n;
	}
}