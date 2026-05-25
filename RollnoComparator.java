// RollnoComparator.java
// Comparator that orders Student objects by roll number (ascending).

import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        // Integer.compare handles all edge cases (negatives, overflow) safely
        return Integer.compare(a.getRollno(), b.getRollno());
    }
}
