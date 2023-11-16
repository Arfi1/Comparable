package Students;

public class Student implements Comparable<Student>{
    private String name;
    private int zipCode;
    private boolean livingWithParents;
    private  char gender;


    public Student(String name, int zipCode, boolean livingWithParents, char gender) {
        this.name = name;
        this.zipCode = zipCode;
        this.livingWithParents = livingWithParents;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Students.Student{" +
                "name='" + name + '\'' +
                ", zipCode=" + zipCode +
                ", livingWithParents=" + livingWithParents +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
