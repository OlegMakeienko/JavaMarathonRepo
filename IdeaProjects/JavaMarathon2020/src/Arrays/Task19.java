package Arrays;

/**
 * 18. У вас есть доллары. Вы хотите обменять их на гривны.
 * Есть информация о стоимости купли-продажи в банках города.
 * В городе N банков. Составьте программу, определяющую,
 * какой банк выбрать, чтобы выгодно обменять доллары на гривны.
 */
public class Task19 {

    public static void main(String[] args) {
        String[] banks = {"Bank 1", "Bank 2", "Bank 3", "Bank 4", "Bank 5"};
        double[] exchangeRates = {29.0, 30.2, 29.2, 29.9, 30.3};
        System.out.println(findBank(banks, exchangeRates));
    }

    public static String findBank(String[] banks, double[] exchangeRates) {
        int maxRateIndex = 0;
        for (int i = 0; i < banks.length; i++) {
            if (exchangeRates[i] > exchangeRates[maxRateIndex]) {
                maxRateIndex = i;
            }
        }
        return banks[maxRateIndex];
    }
}