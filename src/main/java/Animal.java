public class Animal

{
    public static void main(String[] args) {

        Animal A1 = new Animal ();
        A1.printName("Dog");
        A1.printValue(12);
    }
    public String printName(String name)
    {
      System.out.println(name);
      return name;
    }

    public int printValue(int value)
    {
        System.out.println(value);
        return value;
    }

}
