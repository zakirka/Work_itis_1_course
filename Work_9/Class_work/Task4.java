public interface Venicle {
	void start();
	void stop();
	void speedUp(int increment);
}

public class Car implements Venicle {
	private int speed;
	private boolean isRunning;

	public Car() {
		this.speed = 0;
		this.isRunning = false;
	}

	public void start(){
		if (!isRunning){
			isRunning = true;
			System.out.println("Автомобиль завелся");
		} else {
			System.out.println("Автомобиль уже заведен");
		}
		
		speed = 0;
	}


	public void stop(){
		if (isRunning){
			System.out.println("Автомобиль остановлен");	
		} else {
			System.out.println("Автомобиль уже остановлен");
		}

		speed = 0;
	}


	public void speedUp(int increment){
		if (isRunning){
			speed += increment;
			System.out.println("Автомобиль разогнался до " + speed + " км/ч");	
		} else {
			System.out.println("Автомобиль не запущен. Сначала запустите его");
		}		
	}
}

public class Bike implements Venicle{
	private int speed;
	private boolean isRunning;

	public Bike(){
		this.speed = 0;
		this.isRunning = false;
	}

	public void start(){
		if (!isRunning){
			isRunning = true;
			System.out.println("Велосипед запущен");
		} else {
			System.out.println("Велосипед уже работает");
		}
		
		speed = 0;
	}


	public void stop(){
		if (isRunning){
			System.out.println("Велосипед остановлен");	
		} else {
			System.out.println("Велосипед уже остановлен");
		}

		speed = 0;
	}


	public void speedUp(int increment){
		if (isRunning){
			speed += increment;
			System.out.println("Велосипед разогнался до " + speed + " км/ч");	
		} else {
			System.out.println("Велосипед не запущен. Сначала запустите его");
		}		
	}
}

public class Task4 {
	public static void main(String[] args){

		Venicle myCar = new Car();
		Venicle myBike = new Bike();

		myCar.start();
		myCar.speedUp(20);
		myCar.stop();

		myBike.start();
		myBike.speedUp(15);
		myBike.stop();
	}
}