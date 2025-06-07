class AllOperatorsDemo 
{
	public static void main(String[] args) 
	{
		// 1. Arithmetic Operators
		int a = 10, b = 5;
		System.out.println("Arithmetic Operators: ");
		System.out.println("a + b = " + (a + b)); //Addition
		System.out.println("a - b = " + (a - b)); //Subtraction
		System.out.println("a * b = " + (a * b)); //Multiplication
		System.out.println("a / b = " + (a / b)); //Division
		System.out.println("a % b = " + (a % b)); //Modulus
		System.out.println();
		
		// 2. Unary Operators
        System.out.println("Unary Operators:");
        System.out.println("++a = " + (++a));  // Pre-increment
		System.out.println("a++ = " + (a++));  // Post-increment
        System.out.println("--b = " + (--b));  // Pre-decrement
		System.out.println("b-- = " + (b--));  // Post-decrement
        System.out.println("-a = " + (-a));    // Unary minus
		System.out.println();
		
		// 3. Relational (Comparison) Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal
        System.out.println("a != b: " + (a != b));  // Not equal
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater or equal
        System.out.println("a <= b: " + (a <= b));  // Less or equal
        System.out.println();
		
		// 4. Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT
        System.out.println();

        // 5. Bitwise Operators
        int m = 5, n = 3;  // Binary: 0101 & 0011
        System.out.println("Bitwise Operators:");
        System.out.println("m & n = " + (m & n));   // AND
        System.out.println("m | n = " + (m | n));   // OR
        System.out.println("m ^ n = " + (m ^ n));   // XOR
        System.out.println("~m = " + (~m));         // NOT
        System.out.println("m << 1 = " + (m << 1)); // Left shift
        System.out.println("m >> 1 = " + (m >> 1)); // Right shift
        System.out.println();

        // 6. Assignment Operators
        int c = 10;
        System.out.println("Assignment Operators:");
        c += 5;  // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3: " + c);
        System.out.println();

        // 7. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Max of a and b is: " + max);  // condition ? true : false
        System.out.println();


	}
}
