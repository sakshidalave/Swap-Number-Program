class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 10;   // number1
        int b = 20;   // number2

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;  // save a in temp
        a = b;         // now a gets value of b
        b = temp;      // now b gets old value of a

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
