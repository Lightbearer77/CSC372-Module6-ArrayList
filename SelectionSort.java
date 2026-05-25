// SelectionSort.java
// Provides two selection sort methods for an ArrayList of Student objects:
//   sortByName()   — uses NameComparator   (alphabetical by name)
//   sortByRollno() — uses RollnoComparator (ascending by roll number)
//
// Selection sort algorithm:
//   For each position i, find the "minimum" element in the remaining
//   unsorted portion [i+1 .. end] and swap it into position i.

import java.util.ArrayList;

public class SelectionSort {

    // ----------------------------------------------------------------
    // Sort students alphabetically by name (ascending, case-insensitive)
    // ----------------------------------------------------------------
    public static void sortByName(ArrayList<Student> students) {

        NameComparator comp = new NameComparator();
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;   // assume current position holds the minimum

            // Scan the unsorted portion to find the true minimum
            for (int j = i + 1; j < n; j++) {
                if (comp.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum into position i (only if necessary)
            if (minIndex != i) {
                Student temp       = students.get(i);
                students.set(i,     students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }

    // ----------------------------------------------------------------
    // Sort students by roll number (ascending)
    // ----------------------------------------------------------------
    public static void sortByRollno(ArrayList<Student> students) {

        RollnoComparator comp = new RollnoComparator();
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;   // assume current position holds the minimum

            // Scan the unsorted portion to find the true minimum
            for (int j = i + 1; j < n; j++) {
                if (comp.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum into position i (only if necessary)
            if (minIndex != i) {
                Student temp       = students.get(i);
                students.set(i,     students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }
}
