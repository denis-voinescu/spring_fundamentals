package chapter_4.decoupling;

public class SorterByName implements  Sorter{
    @Override
    public void sortDetails() {
        System.out.println("Sorted by name");
    }
}
