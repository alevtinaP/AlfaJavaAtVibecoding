package logo;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.Random;

//import static logo.FigletFont.*;

public class LogoGenerator {
    // массив для первой строки логотипа
    private static final String[] lastName = {"Petrov", "Ivanov", "Sidorov", "Pupkin", "Vasechkin"};

    //объект Random для генерации первой части
    private static final Random RANDOM = new Random();

    //объект Faker для генераци второй части
    private static final Faker FAKER = new Faker();

    static void main(String[] args) throws IOException {
        String firstLine = getRandomLastName();
        String middleLine = "AND";
        String lastLine = FAKER.name().lastName();

        //отрисовка
        System.out.println(FigletFont.convertOneLine(firstLine));
        System.out.println(FigletFont.convertOneLine(middleLine));
        System.out.println(FigletFont.convertOneLine(lastLine));

        // ****** Генерация юр. данных ********
        // Генерация адреса
        String address = FAKER.address().fullAddress();

        // Генерация номера телефона
        String phoneNumber = FAKER.phoneNumber().phoneNumber();

        // Генерация полного имени
        String fulName = FAKER.name().fullName();

        //вывод данных в консоль под логотипом
        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(fulName);
    }

    //метод для генерации первой части логотипа
    public static String getRandomLastName() {
        int randomIndex = RANDOM.nextInt(lastName.length);
        return lastName[randomIndex];
    }
}
