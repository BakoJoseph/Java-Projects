public class Currency{
    public void currencyConverter(double  amount,String from,String to){
     double result = amount * 0.96;
        System.out.println(result + "£");

    }

    public static void main(String[] args) {
       Currency money =new Currency();
      money.currencyConverter(700,"USD","EUR");
    }

}
