public class Animal {
	private String name;
	private int age;

	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public String speak(){
		return "Some sound";
	}
}

public class Dog extends Animal {
	private String breed;

	public Dog(String name, int age, String breed){
		super(name,age);
		this.breed = breed;
	}

	public String speak() {
		return "Woof!";
	}

	public String getBreed() {
		return breed;
	}
}

public class Cat extends Animal {
	private String color;

	public Cat(String name, int age, String color) {
		super(name,age);
		this.color = color;
	}
	public String speak(){
		return "Meow!";
	}
	public String getColor() {
		return color;
	}
}

public class Task5 {
	public static void main(String[] args){

		Animal[] animals = new Animal[4];
		animals[0] = new Dog("Rex",5,"Spitz");
		animals[1] = new Dog("Max",4,"Buldog");
		animals[2] = new Cat("Milka",2,"White");
		animals[3] = new Cat("Gabriel",6,"Black");
		for (Animal animal : animals){
			System.out.println(animal.getName() + " says: " + animal.speak());
		}
	}
}