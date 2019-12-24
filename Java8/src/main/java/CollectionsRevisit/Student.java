// Helpful way to search object of different kinds is giving a object a unique number
// and then searching using the unique number  -- This is the hashcode of the object
// and this number must be repeatable.

package CollectionsRevisit;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    float gpa;
    int height;
    int debt;

    public Student(String name, float gpa, int height, int debt) {
        this.name = name;
        this.gpa = gpa;
        this.height = height;
        this.debt = debt;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", height=" + height +
                ", debt=" + debt +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        return (int)(Math.signum(this.gpa - o.gpa));
        return  Float.compare(this.gpa,o.gpa);
    }


    public static void main(String[] args) {
        Student s1 = new Student("Jim",3.3f,10,10);
        Student s2 = new Student("Jordan",3.2f,10,10);
        Student s3 = new Student("Micheal",2.3f,10,10);

        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s2));

        List<Student> studentList = Arrays.asList(s1,s2,s3);
        System.out.println(studentList);
        studentList.sort(null);
        System.out.println(studentList);


    }
}
