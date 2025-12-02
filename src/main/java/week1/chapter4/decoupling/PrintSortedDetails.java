package week1.chapter4.decoupling;

public class PrintSortedDetails {

    private Sorter sorter;

    public PrintSortedDetails(Sorter sorter) {
        this.sorter = sorter;
    }

    public void printDetails() {
        sorter.sortDetails();
    }
}
