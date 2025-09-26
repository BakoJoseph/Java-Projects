package io;
public class VowelC {
    public static int CheckV(String name){
        name = name.toLowerCase();
        int num = 0;
        for (int i = 0; i <name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
            || name.charAt(i) == 'u');
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        String name = "JOSEPH";
        String surname = new String("BOSS");
        String nickname = "      josh     ";
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(nickname);



    }
}

