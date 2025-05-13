class Calculator
{
    public int add (int num1, int num2)
    {
        int result = num1 + num2;
        System.out.println("Int");
        return result;
    }
    public double add (double num1, double num2)
    {
        double result = num1 + num2;
        System.out.println("double");
        return result;
    }
}

public class Demo
{
    public static void main (String a[])
    {
        int number1 = 7;
        int number2 = 5;
        double number3 = 5.6;

        Calculator calc = new Calculator();
        double result = calc.add (number3, number3);
        System.out.println(result); 
    }

}


