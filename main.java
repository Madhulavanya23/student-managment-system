import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Delete 4.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                students.add(new Student(id, name));
                System.out.println("Student Added ✅");
            }

            else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found ");
                } else {
                    for (Student s : students) {
                        System.out.println("ID: " + s.id + " Name: " + s.name);
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();

                boolean found = false;
                for (Student s : students) {
                    if (s.id == id) {
                        students.remove(s);
                        found = true;
                        System.out.println("Student Deleted ✅");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found ");
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice ");
            }
        }
    }
}