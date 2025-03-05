package Polymorphism;

class ComplexNumber {
  int real, imag;

  // Constructor
  ComplexNumber(int real, int imag) {
      this.real = real;
      this.imag = imag;
  }

  // Custom method to mimic operator overloading
  ComplexNumber add(ComplexNumber other) {
      return new ComplexNumber(this.real + other.real, this.imag + other.imag);
  }

  // Display method
  void display() {
      System.out.println(real + " + " + imag + "i");
  }

  public static void main(String[] args) {
      ComplexNumber c1 = new ComplexNumber(3, 5);
      ComplexNumber c2 = new ComplexNumber(2, 4);

      ComplexNumber sum = c1.add(c2);  // Using our custom method instead of +
      sum.display();  // Output: 5 + 9i
  }
}
