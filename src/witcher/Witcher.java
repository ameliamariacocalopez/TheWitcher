package witcher;

public class Witcher {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isHasSoul() {
		return hasSoul;
	}

	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	private int health;
	private boolean hasSoul;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
