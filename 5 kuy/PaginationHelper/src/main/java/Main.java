import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

//        a.pageCount();
//        a.pageIndex(20);
//        a.pageItemCount(1);
//        helper.pageIndex(8);
/*
        helper.pageIndex(5); //should == 1 (zero based index)
        helper.pageIndex(2); //should == 0
        helper.pageIndex(20); //should == -1
        helper.pageIndex(-10); //should == -1*/
    }

}
