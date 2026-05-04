public class NightDuty {
    static void main(String[] args) {

        int pass = 0;
        int flaky = 0;
        int bug = 0;
        int critical = 0;

             for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Тест #" + i + ": " + "Critical!");
                critical++;
            } else if (i % 3 == 0) {
                System.out.println("Тест #" + i + ": " + "Flaky");
                flaky++;
            } else if (i % 5 == 0) {
                System.out.println("Тест #" + i + ": " + "Bug");
                bug++;
            } else {
                System.out.println("Тест #" + i + ": " + "Pass");
                pass++;
            }
        }
        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====");
        System.out.println("Всего тестов: 100");
        System.out.println("Pass: " + pass);
        System.out.println("Flaky: " + flaky);
        System.out.println("Bug: " + bug);
        System.out.println("Critical: " + critical);
    }
}