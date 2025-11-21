package chapter_4.decoupling;

public class Main {

    static void main(String[] args) {

        Sorter sorterByAge = new SorterByAge();
        PrintSortedDetails psd = new PrintSortedDetails(sorterByAge);

        psd.printDetails();
    }
}
