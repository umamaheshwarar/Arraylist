
import java.util.ArrayList;

public class MyProgram
{
    public static void main(String[] args)
    {
        ArrayList<String> avengers = new ArrayList<String>();
        avengers.add("Thor");
        avengers.add("Hawkeye");
        avengers.add("Hulk");
        
        avengers.add(1, "Black Widow");
       
        
        System.out.println("The ArrayList avengers has " + avengers.size() +" avengers in it!");
    }
}