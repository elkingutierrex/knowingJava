class Calculator
{
    public int add (int num1, int num2)
    {
        int result = (num1 + num2);
        return result;
    }
}

public class Demo
{
    public static void main (String a[])
    {
        int number1 = 7;
        int number2 = 5;

        Calculator calc = new Calculator();
        int result = calc.add( number1, number2);
        System.out.println(result); 
    }

}