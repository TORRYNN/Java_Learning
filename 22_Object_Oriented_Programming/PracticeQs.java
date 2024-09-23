public class PracticeQs {
    public static void main(String args[]) {
        Complex obj1 = new Complex(5, 4);
        Complex obj2 = new Complex(3, 2);
        Complex sum = obj1.add(obj2);
        sum.print();

    }
}

class Complex {
    int real;
    int imag;
    int realres;
    int imagres;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex num) {
        realres = this.real + num.real;
        imagres = this.imag + num.imag;

        return new Complex(realres, imagres);
    }

    Complex sub(Complex num) {
        realres = this.real - num.real;
        imagres = this.imag - num.imag;

        return new Complex(realres, imagres);

    }

    Complex mul(Complex num) {
        realres = (this.real * num.real) - (this.imag * num.imag);
        imagres = (this.real * num.real) + (this.imag * num.imag);

        return new Complex(realres, imagres);
    }

    void print() {
        System.out.println(this.real + "+" + this.imag + "i");
    }
}