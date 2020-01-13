import java.util.List;

class BinaryArrayToNumber {

    static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}

/*
import java.util.List;

class BinaryArrayToNumber {

    static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder res = new StringBuilder();
        for (Integer i : binary) {
            res.append(i);
        }
        return Integer.parseInt(res.toString(), 2);
    }
}*/
