import java.util.List;

public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        return ceilDivideInts(collection.size(), itemsPerPage);
    }

    private int ceilDivideInts(int a, int b) {
        return (int) Math.ceil((double) a / b);
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex + 1 > pageCount() || pageIndex < 0) return -1;
        if (pageIndex < pageCount() - 1) return itemsPerPage;
        return collection.size() % itemsPerPage;
    }

    public int pageIndex(int itemIndex) {
        if (collection == null || collection.isEmpty() || itemIndex > collection.size() || itemIndex < 0) return -1;
        int pageIndex = ceilDivideInts(itemIndex, itemsPerPage);
        return pageIndex == 0 ? 0 : pageIndex - 1;
    }
}