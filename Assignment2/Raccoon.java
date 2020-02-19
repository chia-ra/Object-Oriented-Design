
public class Raccoon extends Animal implements Actions {

	Raccoon(String name) {
		//call super constructor
		super(name);
	}
	@Override
	public void move() {
		//implemented by Actions interface
		System.out.println(this.getMovement());
	}

	@Override
	public void sound() {
		//implemented by Actions interface
		System.out.println("[chittering] ");
	}

	@Override
	public void eat() {
		//implemented by Actions interface
		System.out.println("eating... ");
	}

	@Override
	public void sleep() {
		//implemented by Actions interface
		System.out.println("zzzz... ");
	}
	
	public void scratch() {
		//raccoon specific method
		System.out.println("scratching... ");
	}
	
	//getters and setters for animal inherited attributes
		public void setName(String name) {
			super.setName(name);
		}
		public String getName() {
			return super.getName();
		}
		
		public void setType(String type) {
			super.setType(type);
		}
		public String getType() {
			return super.getType();
		}
		
		public void setGender(String gender) {
			super.setGender(gender);
		}
		public String getGender() {
			return super.getGender();
		}

		public void setEnvironment(String e) {
			super.setEnvironment(e);
		}
		public String getEnvironment() {
			return super.getEnvironment();
		}
		
		public void setMovement(String movement) {
			super.setMovement(movement);
		}
		public String getMovement() {
			return super.getMovement();
		}
		
		public void setAge(int a) {
			super.setAge(a);
		}
		public int getAge() {
			return super.getAge();
		}
}
