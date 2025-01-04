import java.util.*;

public class Indian_Coins {
    public static void main(String[] args) {
        Integer[] currency = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 11111;
        
        Arrays.sort(currency, Comparator.reverseOrder());

        int countOfCurrency = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < currency.length; i++) {
            if (currency[i] <= amount) {
                while (currency[i] <= amount) {
                    countOfCurrency ++;
                    ans.add(currency[i]);
                    amount -= currency[i];
                }
            }
        }

        System.out.println("Minimum Currency used is = " + countOfCurrency);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
