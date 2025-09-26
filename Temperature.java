public class Temperature {
    public void celsiusToFahrenheit(double C){

        if (C < 0){
            System.out.println("It's freezing");
        }
        else {
            double F = (C * 9/5)+32;
            System.out.println(F + "℉");
            //System.out.println("Normal");
        }

    }
    public void fahrenheitToCelsius(double F){
        if (F < 0){
            System.out.println("it's hot");
        }
        else {
            double C = ((F - 32)*5/9);
            System.out.println(C + "℃");
        }

    }

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.celsiusToFahrenheit(7);
        temp.fahrenheitToCelsius(50);
    }
}
