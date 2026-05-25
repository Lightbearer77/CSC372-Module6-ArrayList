// NameComparator.java
// Comparator that orders Student objects alphabetically by name.

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        // compareToIgnoreCase keeps the sort case-insensitive
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
