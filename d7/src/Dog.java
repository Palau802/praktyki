import java.util.*;
import java.util.List;

public class Dog extends Animal {

    public static void main(String[] args) {


    }

    public static List<Object> makeSound()
    {
        String a = "woof";

        Animal.name = "pat";
        Animal.colour = "white";

        return Arrays.asList(a,Animal.name,Animal.colour);

    }

}
