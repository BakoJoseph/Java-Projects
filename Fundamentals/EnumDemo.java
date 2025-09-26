package Fundamentals;

public class EnumDemo {
    enum days{SUNDAY(0), MONDAY(1),TUESDAY(2);
    int id;

        days(int i) {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    void widenConversion(){
        int a  = 7 ;
        double b  = a;
    }
    void narrowConversion(){
        double a = 9;
        int b = (int)a; //typecasting
    }
    public  static void wrapper(){
        int a = 7;
        int b  = 8;
        System.out.println(a);
        System.out.println((double) b);
    }

    public static void main(String[] args) {
//        System.out.println(days.values()[2]);
//        for ( days Days : days.values()) {
//            System.out.println(Days);
//        }
        System.out.println(days.values().length);
        wrapper();

    }
}
