package Day1;

public class ConditionalIfElse {
    public static void main(String[] args) {

        int age = 34;

        //find the age stage based on the given condition
        if (age >=0 && age <18)
        {
            System.out.println(" user is a boy");
        }
        else if (age >=18 && age <60)
        {
            System.out.println("user is an adult");
        }
        else
        {
            System.out.println("user is senior citizen");
        }
    }
}
