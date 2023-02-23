
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author Aung
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked = false;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
	
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		System.out.println("My name is: "+name);
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power){
		health=health-power;
		isLocked();
		System.out.println("Damage: "+power + " Remaining Health Points: "+health);
		
	}//end takeDamage
	
	/**
	 * @return the locked
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * @param locked the locked to set
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name=name;
		System.out.println("My wizard Name is: "+name);
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health=health;
		System.out.println("My total health is: "+health);
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	/**
	 * Setter for key
	 * @param health
	 */
	public void setKey(int key) {
		if(key > 0 ) {
			this.key=key;
		}
	}//end setKey
	
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	@Override
	public void lock(int key) {
		key = getKey();
		locked = true;
		
	}//end of lock

	@Override
	public void unlock(int key) {
		key = getKey();
		locked = false;

	}//end of unlock
	
}//end class
