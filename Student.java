// Student.java
// Represents a student with a roll number, name, and address.

public class Student {

    int rollno;
    String name;
    String address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name   = name;
        this.address = address;
    }

    // Getters
    public int getRollno()      { return rollno;  }
    public String getName()     { return name;    }
    public String getAddress()  { return address; }

    // Produces a readable one-line description of the student
    @Override
    public String toString() {
        return String.format("Roll# %-4d | %-18s | %s", rollno, name, address);
    }
}
