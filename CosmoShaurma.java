public class CosmoShaurma {
	public static void main (String[] args) {
	String name = "Аля";
	String dolzhnost = "Старший шаурма-инженер";
	double dayRate = 16000;
	int kolSmen = 20;
	double bonus = 3000;
	double shtraf = 500;
	double price = 100;
	int shaurmaCount = 40;

		System.out.println();
		System.out.println("Сотрудник: " + name);
		System.out.println("Должность: " + dolzhnost);
		System.out.println("Оплата за смены : " + dayRate*kolSmen);
		System.out.println("Премия: " + bonus);
		System.out.println("Штраф : " + shtraf);
		System.out.println("-----------------------------");
		System.out.println("Итоговая зарплата : " + ((dayRate*kolSmen)-(shtraf*3)+(bonus*2)));
		System.out.println("Шаур-выручка: " + price*shaurmaCount);
	}
}
