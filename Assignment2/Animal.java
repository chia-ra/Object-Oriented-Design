
public class Animal {

	//parent class for animal species classes
	public String name;
	public String type;
	public String gender;
	public String environment;
	public String movement;
	public int age;
	
	Animal(String name) {
		this.name = name;
	}
	
	public String toString() {
		//return a string of the animal's name and type
		return (name + " " + type);
	}

	//setters and getters
	public void setName(String name2) {
		name = name2;
	}

	public String getName() {
		return name;
	}

	public void setType(String type2) {
		type = type2;
	}

	public String getType() {
		return type;
	}

	public void setGender(String gender2) {
		gender = gender2;
	}

	public String getGender() {
		return gender;
	}

	public void setEnvironment(String e) {
		environment = e;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setMovement(String movement2) {
		movement = movement2;
	}

	public String getMovement() {
		return movement;
	}

	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
}
