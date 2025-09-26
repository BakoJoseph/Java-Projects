package Fundamentals;
public class ArraySum {
    int[] numbers = {7, 2, 3, 45, 84, 90};
    int sum = 0;
    public void AddNum(){
        for (int num : numbers){
            sum += num;
        }
        System.out.println("The sum of the array elements: " + sum);
    }
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        arraySum.AddNum();
    }
}
