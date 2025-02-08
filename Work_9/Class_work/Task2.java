enum Season {
	SPRING, SUMMER, AUTUMN, WINTER
}

public class Task2{
	public static String getWeather(Season season){
		if (season == null) {
			return "Неизвестный сезон";
		}

		switch (season){
			case WINTER:
				return "Холодно";
			case SUMMER:
				return "Жарко";
			case SPRING:
			case AUTUMN:
				return "Прохладно";
			default:
				return "Неизвестный сезон";
		}	
	}
	public static void main(String[] args){
		System.out.println(getWeather(Season.WINTER));
		System.out.println(getWeather(Season.SUMMER));
		System.out.println(getWeather(Season.SPRING));
		System.out.println(getWeather(Season.AUTUMN));

		try {
			Season unknownSeason = Season.valueOf("UNKNOWN");
			System.out.println(getWeather(unknownSeason));
		}
		catch (IllegalArgumentException e){
			System.out.println("Неизвестный сезон");
		}
	}
}