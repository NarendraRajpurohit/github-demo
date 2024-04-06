package Day2;

public class ConditionalSwitchStatement {

    public static void main(String[] args) {

        int Feedback = 0;

        switch(Feedback)
        {
            case 0 :
                System.out.println("Did you attend the class");
                System.out.println("extra line2");
                break;
            case 1:
                System.out.println("Not good");
                break;
            case 2:
                System.out.println("Need Improvement");
                break;
            case 3 :
                System.out.println("Ok");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Doing good");
                break;
            default :
            System.out.println("wrong input");
            break;
        }
    }


    }

