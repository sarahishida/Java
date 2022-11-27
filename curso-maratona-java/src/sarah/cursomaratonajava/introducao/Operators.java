package sarah.cursomaratonajava.introducao;

public class Operators {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        int result = number1 * number2;
        System.out.println(result);

        //%
        int divisionRemainder = 21 % 2;
        System.out.println(divisionRemainder);

        // < > <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenMinorThanTwenty = 10 < 20;
        boolean isTenEqualThanTwenty = 10 == 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        System.out.println("isTenBiggerThanTwenty " + isTenBiggerThanTwenty);
        System.out.println("isTenMinorThanTwenty " + isTenMinorThanTwenty);
        System.out.println("isTenEqualThanTwenty " + isTenEqualThanTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);

        // && (AND) || (OR) ! (NOT)
        int age = 35;
        float salary = 3500F;
        boolean isInTheLawBiggerThanThirty = age >= 30 && salary >= 4612;
        boolean isInTheLawMinorThanThirty = age < 30 && salary >= 3381;
        System.out.println("isInTheLawBiggerThanThirty "+ isInTheLawBiggerThanThirty);
        System.out.println("isInTheLawMinorThanThirty "+ isInTheLawMinorThanThirty);

        double currentAccountTotalAmount = 200;
        double savingsAccountTotalAmount = 10000;
        float ps5 = 5000F;

        boolean isPs5Buyable = currentAccountTotalAmount > ps5 || savingsAccountTotalAmount > ps5;
        System.out.println("isPs5Buyable " + isPs5Buyable);

        // = += -=  *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int count = 0;
        count++; //count += 1;
        ++count;
    }
}
