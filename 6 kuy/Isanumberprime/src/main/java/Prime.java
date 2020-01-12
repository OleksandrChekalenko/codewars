import java.math.BigInteger;

class Prime {
    static boolean isPrime(int num) {
      if (num <= 0) return false;
      return BigInteger.valueOf(num).isProbablePrime(num);
    }
}

/*
class Prime {
    static boolean isPrime(int num) {
        if (num <= 0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}*/
