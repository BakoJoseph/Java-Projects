package data;

public class GenericBox <T>{
    T variable;

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

    public static void main(String[] args) {
        GenericBox<Double> g1 = new GenericBox<>();
        g1.setVariable(6.0);
        System.out.println(g1.getVariable());

        GenericBox<String> g2 = new GenericBox<>();
        g2.setVariable("Bako");
        System.out.println(g2.getVariable());
    }
}
