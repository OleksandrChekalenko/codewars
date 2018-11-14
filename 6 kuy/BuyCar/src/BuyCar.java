import java.util.Arrays;

public class BuyCar {


    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        if (startPriceOld >= startPriceNew) return new int[]{0, startPriceOld - startPriceNew};

        int month = 0, save = 0;
        double depPriceNew = startPriceNew, depPriceOld = startPriceOld;
        double lossPercantage = percentLossByMonth;

        while (save + depPriceOld < depPriceNew) {
            month++;
            if (month % 2 == 0) lossPercantage += 0.5;

            save += savingperMonth;
            depPriceOld -= depPriceOld * (lossPercantage / 100);
            depPriceNew -= depPriceNew * (lossPercantage / 100);
        }
        return new int[]{month, (int) Math.round(save + depPriceOld - depPriceNew)};
    }

   /* public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        int count = 0;
        int month = 0;
        int save = 1000;
        while (save + startPriceOld < startPriceNew) {
            if (count == 2) {
                count = 0;
                percentLossByMonth += 0.5;
            }
            startPriceOld -= (int) ((startPriceOld / 100) * percentLossByMonth);
            save += savingperMonth;
            count++;
            month++;
        }

        return new int[]{month, startPriceOld >= startPriceNew ? startPriceOld > startPriceNew ? startPriceOld - startPriceNew : 0 : save + startPriceOld - startPriceNew - 10};
    }*/
   /*public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        if (startPriceOld >= startPriceNew) return new int[]{0, startPriceOld - startPriceNew};

        int month = 0, save = 0;

        while (save + startPriceOld < startPriceNew) {
            month++;
            if (month % 2 == 0) percentLossByMonth += 0.5;

            save += savingperMonth;
            startPriceOld -= startPriceOld * (percentLossByMonth / 100);
            startPriceNew -= startPriceNew * (percentLossByMonth / 100);
        }
        return new int[]{month, save + startPriceOld - startPriceNew};
    }
*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbMonths(2000, 8000, 1000, 1.5)));
        System.out.println(Arrays.toString(nbMonths( 5864, 8410, 1193, 1.5)));
    }
}
