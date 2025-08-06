package irene;

class Student {
    String name;
    static int studentCount = 0;

    
    Student(String name) {
        this.name = name;
        studentCount++;
    }
    public void getStudentDetails() {
        System.out.println("Name: " + name);
    }


    public static int getStudentCount() {
        return studentCount;
    }
}

public class Basics14 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

       
        student1.getStudentDetails();
        student2.getStudentDetails();
        student3.getStudentDetails();

      
        System.out.println("Total number of students: " + Student.getStudentCount());
    }
}
