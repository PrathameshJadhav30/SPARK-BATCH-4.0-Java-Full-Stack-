class BitwiseOperators 
{
	public static void main(String[] args) 
	{
		 int m = 5, n = 3; // 5: 0101, 3: 0011
        System.out.println("m & n = " + (m & n));  // AND
        System.out.println("m | n = " + (m | n));  // OR
        System.out.println("m ^ n = " + (m ^ n));  // XOR
        System.out.println("~m = " + (~m));        // NOT
        System.out.println("m << 1 = " + (m << 1)); // Left Shift
        System.out.println("m >> 1 = " + (m >> 1)); // Right Shift
	}
}
