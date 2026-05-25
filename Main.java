// Main.java
// Demonstrates storing 10 Student objects in an ArrayList and sorting
// them two ways using custom selection sort methods.

import java.util.ArrayList;

public class Main {

    // Helper: print every student in the list with a header
    private static void printList(String header, ArrayList<Student> students) {
        System.out.println("\n" + header);
        System.out.println("─".repeat(55));
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("─".repeat(55));
    }

    public static void main(String[] args) {

        // ── Build the ArrayList of 10 students ──────────────────────
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(4,  "Diana Prince",    "Themyscira, Greece"));
        students.add(new Student(7,  "Bruce Wayne",     "Gotham City, NJ"));
        students.add(new Student(2,  "Lena Luthor",     "Metropolis, NY"));
        students.add(new Student(9,  "Arthur Curry",    "Atlantis, Pacific"));
        students.add(new Student(1,  "Zatanna Zatara",  "New York, NY"));
        students.add(new Student(6,  "Clark Kent",      "Smallville, KS"));
        students.add(new Student(3,  "Hal Jordan",      "Coast City, CA"));
        students.add(new Student(10, "Barry Allen",     "Central City, MO"));
        students.add(new Student(5,  "Oliver Queen",    "Star City, CA"));
        students.add(new Student(8,  "Victor Stone",    "Detroit, MI"));

        // ── Print unsorted list ──────────────────────────────────────
        printList("UNSORTED (insertion order):", students);

        // ── Sort by name and display ─────────────────────────────────
        SelectionSort.sortByName(students);
        printList("SORTED BY NAME (A → Z):", students);

        // ── Sort by roll number and display ──────────────────────────
        SelectionSort.sortByRollno(students);
        printList("SORTED BY ROLL NUMBER (low → high):", students);
    }
}
