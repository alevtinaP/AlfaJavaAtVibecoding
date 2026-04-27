public class Password {
    static void main() {
        String[] password = {"234567890", "passwordz", "qwerty"};
        boolean isPasswordPassed;

        for (int i = 0; i < password.length; i++) {
            String pass = password[i];
            if (!(pass.charAt(0) == 1) && !(pass.charAt(pass.length() - 1) == 'z') && pass.length() > 8 && !pass.contains("qwerty") && !pass.contains("1234")) {

                isPasswordPassed = true;

            } else isPasswordPassed = false;

            System.out.println("Пароль: " + pass + " прошел проверку? " + (isPasswordPassed ? "Да" : "Нет"));

        }
    }

}
