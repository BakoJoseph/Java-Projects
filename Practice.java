public class Practice {
    /**
     NOTE- if you are using a void you will not have a return statement but if
     you are not using a void your method must have a return statement.
     This is the syntax for creating method:
     accessSpecifier accessModifier returnType methodName(Parameters){
     Method Body
     return
     This is the syntax for creating a variable:
     dataType variableName ; or
     dataType variableName = value;
     **/
    String name = "Joseph"; /** This is a global variable **/
    int Age = 16;
    Boolean inClass = true;
    String gender = "Male";
    String profession = "Data Analyst";

    public String Information(){
        String result = "Your information: "; // This is a local variable6
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Give me my status ");
        Practice info = new Practice();
        info.Information();
        System.out.println("Your name: " + info.name); // This is called concatenation
        System.out.println("Your Age: " + info.Age + " years");
        System.out.println("Was in class: " + info.inClass);
        System.out.println("Your profession: " + info.profession);
        System.out.println("Your gender: " + info.gender);
    }

}
