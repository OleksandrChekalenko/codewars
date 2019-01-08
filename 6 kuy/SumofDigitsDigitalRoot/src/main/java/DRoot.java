
public class DRoot {
    public static int digital_root(int n) {
        char[] array = String.valueOf(n).toCharArray();
        int resul = 0;
        for (int i = 0; i < array.length; i++){
            resul += Integer.parseInt(String.valueOf(array[i]));
        }
        return resul > 9 ? digital_root(resul) : resul;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(456));
    }
}