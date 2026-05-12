import java.time.LocalDate;
import java.util.Random;

public class DarkNorthProtocols {

    static void main(String[] args) {

        String accessCode = generateAccessCode();
        System.out.println(accessCode);

        System.out.println(isValidCode("code", 8));

        logEvent("Server protection activated");
        logEvent("Intrusion attempt detected", true);

        System.out.println(generateAgentId("Agent", 42));
        System.out.println(generateAgentId("Agent", 77));
        System.out.println(generateAgentId("Agent", 13));
    }

    // 1. Протокол ГЕНЕРАТОР
    public static String generateAccessCode() {
        int year = LocalDate.now().getYear();
        double result = Math.pow(3, 7);
        int resultInt = (int) result;
        String code = year + "_" + resultInt;
        return code;
    }

    // 2. Протокол ВАЛИДАТОР
    private static boolean isValidCode(String code, int minLength) {

        boolean checkCodeResult;

        if (code != null && code.length() >= minLength && code.contains("-")) {
            checkCodeResult = true;
        } else checkCodeResult = false;
        return checkCodeResult;
    }

    // 3. Протокол ЛОГГЕР
    public static void logEvent(String massage) {
        System.out.println(("[INFO] " + massage));
    }

    public static void logEvent(String massage, boolean isCritical) {
        if (isCritical) {
            System.out.println(("[CRITICAL] " + massage));
        } else logEvent(massage);
    }

    // 4. Протокол РАНДОМАЙЗЕР
    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int a = random.nextInt(9000) + 1000;
        return prefix + "-" + a;
    }
}
