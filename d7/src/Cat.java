import java.util.*;
public class Cat extends Animal {

    public static void main(String[] args) {


    }

    public static List<Object> makeSound()
    {
        String a = "meow";

        Animal.name = "mat";
        Animal.colour = "grey";

        return Arrays.asList(a,Animal.name,Animal.colour);

    }

}
