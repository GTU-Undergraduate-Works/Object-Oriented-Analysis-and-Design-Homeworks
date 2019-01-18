package duraklefkan.gtu.cse443.hw3.question4;

/**
 * Class to represent complex numbers.
 */
public class Complex {

    private final double real;
    private final double imaginary;

    /**
     * Constructs Complex number with given real and imaginary part
     * @param real real part
     * @param imag imaginary part
     */
    public Complex(double real, double imag) {
        this.real = real;
        imaginary = imag;
    }

    /**
     * Returns the string representation of this complex number
     * @return srting representation of this complex
     */
    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary < 0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }

    /**
     * Sums given complex number with this complex number
     * @param b complex to sum
     * @return sum of this complex number and given complex number
     */
    public Complex plus(Complex b) {
        Complex a = this;
        double real = a.real + b.real;
        double imag = a.imaginary + b.imaginary;
        return new Complex(real, imag);
    }

    public Complex minus(Complex b) {
        Complex a = this;
        double real = a.real - b.real;
        double imag = a.imaginary - b.imaginary;
        return new Complex(real, imag);
    }

    /**
     * Multiplies this complex number with given complex number.
     * @param b complex number to multiply
     * @return result of multiplying of this complex number and given complex number
     */
    public Complex times(Complex b) {
        Complex a = this;
        double r = a.real * b.real - a.imaginary * b.imaginary;
        double i = a.real * b.imaginary + a.imaginary * b.real;
        return new Complex(r, i);
    }

    /**
     * Gets real part of this complex number.
     * @return returns real part of this complex number
     */
    public double getReal() {
        return real;
    }

    /**
     * Gets imaginary part of this complex number.
     * @return returns imaginary part of this complex number
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Checks the given object is equal this Complex object.
     * @param x object to check
     * @return if two comlex numbers are equal return true, if not return false
     */
    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Complex that = (Complex) x;
        return (this.real == that.real) && (this.imaginary == that.imaginary);
    }
}

