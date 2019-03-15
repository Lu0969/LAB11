package P1;

public class Student {
    public String name = "Nicolay";
    private int age = 19;
    protected int telefon = 23745;
    String subject = "Physics";

    public Student() {

    }

    public Student(String who) {
        System.out.print("\n\nThe information for " + who + ":" );
    }

    public void show() {
        System.out.print("Student's profile:");
        System.out.print("\nName: " + name);
        System.out.print("\nAge: " + age);
        System.out.print("\nNumber Telefon: " + telefon);
        System.out.print("\nSubject: " + subject);
    }
}

