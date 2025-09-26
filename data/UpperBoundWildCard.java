package data;
import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard {
    static class gender{}
    static class girl  extends gender{}
    static class boy extends gender{}

    static void inputGenders(List<? extends gender> genders){
        for(gender Gender: genders){
        System.out.println(genders);
        }
    }

    public void enterGender(List<? super girl> genders, girl girls){
        genders.add(girls);
    }

    public static void main(String[] args) {
        UpperBoundWildCard upperBoundWildCard = new UpperBoundWildCard();
        List<girl> girls = new ArrayList<>();
        List<boy> boys = new ArrayList<>();
        List<String> str  = new ArrayList<>();
        inputGenders(boys);
    }
}

