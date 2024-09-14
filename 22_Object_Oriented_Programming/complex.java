public class complex {
    public static void main(String args[]){
        // Using the full constructor
        ComplexNumber num1 = new ComplexNumber(3, 4);

        // Using the overloaded constructor (only real part)
        ComplexNumber num2 = new ComplexNumber(5);

        // Using the copy constructor
        ComplexNumber num3 = new ComplexNumber(num1);

        // Adding num1 and num2
        ComplexNumber sum = num1.add(num2);

        // Displaying the numbers and their sum
        num1.display();  // Output: 3 + 4i
        num2.display();  // Output: 5 + 0i
        num3.display();  // Output: 3 + 4i
        sum.display();   // Output: 8 + 4i
    }
}

class ComplexNumber{
    int real;
    int imag;
    ComplexNumber(int real, int imag){
        this.real=real;
        this.imag=imag;
    }
    ComplexNumber(int real){
        this.real = real;
        this.imag = 0;
    }

    ComplexNumber(ComplexNumber obj){
        this.real=obj.real;
        this.imag=obj.imag;
    }
    ComplexNumber add(ComplexNumber obj){
        int realSum = this.real + obj.real; // Add real parts
        int imagSum = this.imag + obj.imag; // Add imaginary parts
        return new ComplexNumber(realSum, imagSum);
    }

    ComplexNumber subtract(ComplexNumber obj){
        int realsub=this.real - obj.real;
        int imagsub=this.imag - obj.imag;

        return new ComplexNumber(realsub, imagsub);
    }

    void display(){
        System.out.println(this.real + " + " + this.imag + "i");
    }
}