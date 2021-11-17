package lab9;


import java.util.List;
import java.util.stream.Stream;

//Write a method to calculate factorial of a number. Test this method using method reference feature. 
public class lab9q5 
{
    public static List<Integer> getFibonacci(int series) {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series).map(n -> n[0]).collect(toList());
    }

    public static void main(String[] args) {

        List<Integer> fibonacci = getFibonacci(10);
        fibonacci.forEach(x -> System.out.println(x));

    }

}

