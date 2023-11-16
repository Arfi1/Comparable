package Students;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorter {
    private ArrayList <Student> students;

    public static void main(String[] args) {
        new StudentSorter().run();
    }

    private void run() {
        students = new ArrayList<>();
        students.add(new Student("Anders", 2200, true, 'M'));
        students.add(new Student("Patrik", 2400, false, 'M'));
        students.add(new Student("Lili", 2000, true, 'F'));
        students.add(new Student("Kat", 3400, false, 'F'));
        students.add(new Student("Hat", 2300, false, 'M'));
        students.add(new Student("Arfi", 5600, true, 'F'));
        students.add(new Student("Ifra", 6700, false, 'F'));
        students.add(new Student("Asha", 7820, true, 'F'));
        students.add(new Student("Hana", 3455, true, 'F'));
        students.add(new Student("Hanadi", 8899, false, 'F'));
        students.add(new Student("Andy", 3200, true, 'M'));

        for (int i= 0; i < students.size(); i ++){
            System.out.println(students.get(i));
        }
        Collections.sort(students);
        System.out.println("After sorting");
        for (int i= 0; i < students.size(); i ++){
            System.out.println(students.get(i));
        }
    }

}
