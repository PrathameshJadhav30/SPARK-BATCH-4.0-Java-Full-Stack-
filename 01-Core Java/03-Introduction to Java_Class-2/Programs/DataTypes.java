class DataTypes 
{
	public static void main(String[] args) 
	{
	   // Integer data types
        byte byteValue = 120;             // Range: -128 to 127
        short shortValue = 30000;         // Range: -32,768 to 32,767
        int intValue = 2000000000;        // Range: -2^31 to (2^31 - 1)
        long longValue = 90000000000L;    // Note the 'L' suffix for long

        // Floating-point data types
        float floatValue = 5.75f;         // 'f' suffix is mandatory
        double doubleValue = 19.99;       // Default type for decimal numbers

        // Character data type
        char charValue = 'A';             // Stores a single Unicode character

        // Boolean data type
        boolean isJavaFun = true;         // true or false only

        // Printing all values
        System.out.println("=== Integer Types ===");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        System.out.println("\n=== Floating Point Types ===");
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        System.out.println("\n=== Character Type ===");
        System.out.println("char: " + charValue);

        System.out.println("\n=== Boolean Type ===");
        System.out.println("is Java Fun? " + isJavaFun);
	}
}
