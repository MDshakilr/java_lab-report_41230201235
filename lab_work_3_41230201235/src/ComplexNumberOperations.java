
class ComplexNumber {
    // Data members
    double real;
    double imag;

    ComplexNumber()
    {
        real = 0.0;
        imag = 0.0;
    }

    ComplexNumber(double r, double i)
    {
        real = r;
        imag = i;
    }

    ComplexNumber add(ComplexNumber c)
    {
        ComplexNumber result = new ComplexNumber();
        result.real = real + c.real;
        result.imag = imag + c.imag;
        return result;
    }

    ComplexNumber add(int value)
    {
        ComplexNumber result = new ComplexNumber();
        result.real = real + value;
        result.imag = imag;
        return result;
    }

    void display()

    {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}


public class ComplexNumberOperations {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(4.5, 3.2);
        ComplexNumber c2 = new ComplexNumber(2.5, -1.8);
        ComplexNumber c3, c4;
        c3 = c1.add(c2);
        c4 = c1.add(5);
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum of Two Complex Numbers: ");
        c3.display();

        System.out.print("After Adding Integer (5) to Real Part: ");
        c4.display();
    }
}
