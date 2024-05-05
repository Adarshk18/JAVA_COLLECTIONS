package Stack;

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("dog");
        animals.push("horse");

        System.out.println("Animals are: " + animals);

        //to check which element is present at the top
        System.out.println(animals.peek());

        animals.pop();
        System.out.println("Animals are: " + animals);


    }
}
