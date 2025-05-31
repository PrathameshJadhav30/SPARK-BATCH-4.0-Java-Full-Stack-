class TypeCastingDemo
{
	public static void main(String[] args) 
	{
		  // 1. Implicit Casting (Widening)
        byte b = 10;
        int i = b;              // byte → int
        float f = i;            // int → float
        double d = f;           // float → double

        System.out.println("=== Implicit Casting (Widening) ===");
        System.out.println("byte to int: " + i);
        System.out.println("int to float: " + f);
        System.out.println("float to double: " + d);

        // 2. Explicit Casting (Narrowing)
        double bigDecimal = 99.99;
        int smallInt = (int) bigDecimal;   // Explicit casting required

        long bigNumber = 100000L;
        short shortNumber = (short) bigNumber; // Possible data loss

        System.out.println("\n=== Explicit Casting (Narrowing) ===");
        System.out.println("double to int (99.99 → " + smallInt + ")");
        System.out.println("long to short (100000 → " + shortNumber + ")");

        // 3. Character to int and vice versa
        char ch = 'A';
        int charCode = ch;  // Implicit casting char → int
        char fromInt = (char) 66; // Explicit casting int → char

        System.out.println("\n=== Character Casting ===");
        System.out.println("char to int: 'A' → " + charCode);
        System.out.println("int to char: 66 → '" + fromInt + "'");
	}
}
