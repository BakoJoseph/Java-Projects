package Fundamentals;
public class Students {
    String name;
    int age;
    static int totalStudents;

    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    static public int getTotalStudents(){
        return totalStudents;
    }

    public static void main(String[] args) {
        Students dare = new Students("Dare", 6);
        Students joseph = new Students("Joseph", 17);
        Students phillip = new Students("Phillip", 29);

        System.out.println("Total Students");
        System.out.println(Students.getTotalStudents());
    }
}
