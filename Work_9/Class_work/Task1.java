abstract class Profession {
	public abstract void work();
}

class Doctor extends Profession {
	public void work(){
		System.out.println("Лечу пациентов");
	}
}

class Teacher extends Profession{
	public void work(){
		System.out.println("Преподаю уроки");
	}
}

public class Task1 {
	public static void executeWork(Profession[] professions){
		for (Profession profession : professions){
			profession.work();
		}
	}
	public static void main(String[] args){
		Profession[] professions = new Profession[2];
		professions[0] = new Doctor();
		professions[1] = new Teacher();

		executeWork(professions);
	}
}