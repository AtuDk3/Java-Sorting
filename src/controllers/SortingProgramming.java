
package controllers;

import common.Algorithsm;
import common.Library;
import models.Element;
import views.Menu;
/**
 *
 * @author Lenovo
 */
public class SortingProgramming extends Menu<String>{
    static String[] mc = {"Buddle Sort", "Quick Sort", "Exit"};

    protected Library library;
    protected Algorithsm algorithm;
    protected int[] array;
    protected int size_array;

    public SortingProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithsm();
        size_array = element.getSize_array();
        array = element.getArray();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("Unsorted array: ");
                library.display(array);
                algorithm.buddleSort(array);
                System.out.println("\nSorted array by Buddle Sort: ");
                library.display(array);
                break;
            case 2:
                System.out.println("Unsorted array: ");
                library.display(array);
                algorithm.quickSort(array, 0, size_array - 1);
                System.out.println("\nSorted array by Quick Sort: ");
                library.display(array);
                break;
            case 3:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }
      
}
