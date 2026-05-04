import java.util.Scanner;
public class Message {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = new String[5];
        // ожидание ввода

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите часть сообщения");
            String part = scanner.nextLine();

            if (part.equalsIgnoreCase("NULL")) {
                System.out.println("Часть сообщения повреждена! Используем резервный фрагмент... ");
                parts[i] = "XX";
            } else {
                parts[i] = part;
            }


           System.out.print("Расшифрованное послание:" + String.join("#", parts));

        }
    }
}