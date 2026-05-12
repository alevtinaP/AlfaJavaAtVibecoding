import java.time.LocalDate;
import java.util.Random;

public class DarkNorthProtocols {

   static void main(String[] args) {

       String accessCode = generateAccessCode();
       System.out.println(accessCode);

       System.out.println(isValidCode("code", 8));

       System.out.println(logEvent("Server protection activated"));
       System.out.println(logEvent("Intrusion attempt detected", true));

       System.out.println(generateAgentId ("Agent", 42));
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
    public static String logEvent (String massage) {
        return "[INFO] " + massage;
    }

    public static String logEvent (String massage, boolean isCritical) {
        if (isCritical) {
            return "[CRITICAL] " + massage;
        } else return logEvent(massage);
            }

    // 4. Протокол РАНДОМАЙЗЕР
    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int a = random.nextInt(9000) + 1000;
        return prefix + "-" + a;
    }

}
