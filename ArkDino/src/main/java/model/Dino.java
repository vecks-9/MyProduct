package model;

public class Dino {
	private String kind;
	private int hp;
	private int stamina;
	private int weight;
	private int oxygen;
	private int strength;
	private int food;
	private int speed;
	private int mutation;
	
	public Dino() {
	}
	
	public Dino(String kind, int hp, int stamina, int weight, int oxygen, int strength, int food, int speed, int mutation) {
		this.kind = kind;
		this.hp = hp;
		this.stamina = stamina;
		this.weight = weight;
		this.oxygen = oxygen;
		this.strength = strength;
		this.food = food;
		this.speed = speed;
		this.mutation = mutation;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setOxygen(int oxygen) {
		this.oxygen = oxygen;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setMutation(int mutation) {
		this.mutation = mutation;
	}
	
	public String getKind() {
		return kind;
	}
	public int getHp() {
		return hp;
	}
	public int getStamina() {
		return stamina;
	}
	public int getWeight() {
		return weight;
	}
	public int getOxygen() {
		return oxygen;
	}
	public int getStrength() {
		return strength;
	}
	public int getFood() {
		return food;
	}
	public int getSpeed() {
		return speed;
	}
	public int getMutation() {
		return mutation;
	}
}
