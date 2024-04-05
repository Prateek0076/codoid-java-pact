import java.io.EOFException;
import java.util.*;

class Student {
    private int age;
    private String subject;

    public Student(int age, String subject) {
        this.age = age;
        this.subject = subject;

    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }
}

public class touplee {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
           students.put("prateek", new Student(22, "java"));
           students.put("lalith", new Student(22, "java"));
           students.put("sanjay", new Student(22, "python"));
           students.put("ebrahim",new Student(26,"python"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter name to search: ");
        String name = scanner.nextLine();
        Student student = students.get(name);

        // if (student != null) {
        //     System.out.println("name: " + name);
        //     System.out.println("age: " + student.getAge());
        //     System.out.println("subject: " + student.getSubject());
        // } else {
        //     System.out.println(name + " not found.");
        // }

        try {
            if (student!=null) {
            System.out.println("name: " + name);}
            System.out.println("age: " + student.getAge());
            System.out.println("subject: " + student.getSubject());


        }
        catch(Exception e){
            System.out.println(name + " not found.");
        }
    }
}
