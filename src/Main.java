import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        int [] payments = new int [5];
        payments [0] = 2470;
        payments [1] = 250;
        payments [2] = 1410;
        payments [3] = 2900;
        payments [4] = 3000;
        int summ = 0;
        for (int i = 0; i < payments.length; i++) {
            summ = summ + payments [i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        //2
        int[] payments2 = {5247, 2658, 3214, 6523, 2011};
        int max = 0;
        int min = payments2[0];
        for (int i = 0; i < payments2.length; i++) {
            if (payments2[i] > max) {
                max = payments2[i];
            }
            if (payments2[i] < min) {
                min = payments2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        //3
        int[] payments3 = {1567, 2475, 6524, 1346, 7554};
        float med = 0f;
        float summ2 = 0f;
        for (int i = 0; i < payments3.length; i++) {
            summ2 = summ2 + payments3[i];
        }
        med = summ2 / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + med + " рублей");

        //4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0, j = reverseFullName.length - 1; i < j; i++, j--) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }
        System.out.println(reverseFullName);
    }
}