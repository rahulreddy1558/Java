package CollectionsRevisit;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class StudentLambda {
    String name;
    int height;
    float gpa;
    String grade;


    public StudentLambda(String name, int height, float gpa, String grade) {
        this.name = name;
        this.height = height;
        this.gpa = gpa;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public float getGpa() {
        return gpa;
    }

    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Map<Integer,String> k = new HashMap<>();
        k.put(1,"ome");
        k.put(1,"one");
        System.out.println(k);
    }

}
