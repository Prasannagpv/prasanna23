import java.util.*;
class Main;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int i=sc.nextInt();
        static Student[] stud = new Student[n];
        //Scanner sc = new Scanner(System.in);
        static int i = 0;

       // Scanner sc = new Scanner(System.in);
        while (true) {

            int select; 
            System.out.println("1. Add Student Record");
            System.out.println("2. View Student Record");
            System.out.println("3. Update Student Record");
            System.out.println("4. Delete Student Record");
            System.out.println("0. Exit");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    addStud(stud);
                    break;
                case 2:
                    viewStud(stud);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }

    }

    public static void addStud(Student[] stud) {
        Scanner sc = new Scanner(System.in);
        int numID, year;
        String userName, course;

        int addmore;
          do {
            System.out.println("1. Enter Student ID: ");
            numID = sc.nextInt();
            sc.nextLine();
            System.out.println("2. Enter Student Name");
            userName = sc.nextLine();
            System.out.println("3. Enter Student Course");
            course = sc.nextLine();
            System.out.println("4. Enter Student Year");
            year = sc.nextInt();
            stud[i] = new Student(numID, year, userName, course);
            ++i;

            System.out.println("To add another Student Record Press 1");
            addmore = sc.nextInt();
        } while (addmore == 1);

    }

    public static void viewStud(Student[] stud) {

        for (Student element : stud) {
            if (null != element) {
                System.out.println("1. Student ID: " + element.getnumID());
                System.out.println("2. Student Name: " + element.getuserName());
                System.out.println("3. Student Course: " + element.getcourse());
                System.out.println("4. Student Year: " + element.getyear() + "\n");
            }
        }

    }