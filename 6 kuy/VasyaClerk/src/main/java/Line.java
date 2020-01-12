class Line {
    static String Tickets(int[] peopleInLine) {
        int coin25 = 0;
        int coin50 = 0;
        for (int value : peopleInLine) {
            if (value == 25) coin25++;
            if (value == 50) {
                coin25--;
                coin50++;
            }
            if (value == 100) {
                if (coin50 > 0) {
                    coin50--;
                    coin25--;
                } else {
                    coin25 -= 3;
                }
            }
            if (coin25 < 0) return "NO";
        }
        return "YES";
    }
}
