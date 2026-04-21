import java.util.Random;

public class BusinessCoach {
	public static void main (String[] args) {
		Random random = new Random();
	
		int age = random.nextInt((83) + 18);
		double amountMoneyInAccount = random.nextDouble()*100_000_000;


		boolean hasInvitation = true;
		boolean inBlackList = false;


		boolean adult = age >= 18;
		boolean hasMoneyInAccountOrInvite = hasInvitation || amountMoneyInAccount>50_000;
		boolean inNotBlackList = !inBlackList;

		double contribution = amountMoneyInAccount * 0.075;

		boolean canEnter = adult && hasMoneyInAccountOrInvite && inNotBlackList;


		//Промежуточные данные
		System.out.println("Возраст: " + age);
		System.out.printf("Сумма на счете: %.2f\n",amountMoneyInAccount);
		System.out.println("Приглашение: " + (hasInvitation ? "Да" : "Нет"));
		System.out.println("В черном списке: " + (inBlackList ? "Да" : "Нет\n"));
		//Итоговый результат
		System.out.println("Вход разрешен? " + (canEnter ? "Да" : "Нет"));
		//Расчет взноса
		System.out.printf("Обязательный добровольный взнос: %.2f\n", contribution);

	
	}
	
}
