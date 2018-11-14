public class Kata {

    public static int toBinary(int n) {
       /* StringBuilder res = new StringBuilder("");
        while (n != 0){
            if( n % 2 == 0 ){
                res.append(0);
                n /= 2;
            } else {
                res.append(1);
                n = ( n - 1 ) / 2;
            }
        }
        return Integer.parseInt(res.reverse().toString());*/
        return Integer.parseUnsignedInt(Integer.toBinaryString(n));
    }
}
