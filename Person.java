public class Person {
    String name;
    static String a;
    String surname = "Joseph";
    String  johnBull =  "john bull";
    char gender = '2';
    float height = 59.5F;
    long number =  7000000000000000L;
    int num =  7000000;
    boolean isSerious = false;



    public static void main(String[] args) {
        System.out.println("------------Person-----------");
        Person john = new Person();
        System.out.println(john.height);

        john.name = "john";
        System.out.println(john.name);
        System.out.println(john.surname);


    }
}

