package Day1;

public class ConditionalIfElse1

{
    public static void main(String[] args)
    {

        int age = 55;
        String Gender = "Female";

        if (age>=0 && age<18)
        {
            if (Gender == "Male")
            {
                System.out.println("user is a boy ");
            }
            else if (Gender == "Female")
            {
                System.out.println("user is a girl");
            }
        }
        else if (age>=18 && age<60)
        {
            if(Gender == "Male")
            {
                System.out.println("user is a man");
            }
            else if (Gender == "Female")
            {
                System.out.println("user is a women");
            }
        }
        else
        {
            System.out.println("user is a senior citizen");
        }
    }
}
