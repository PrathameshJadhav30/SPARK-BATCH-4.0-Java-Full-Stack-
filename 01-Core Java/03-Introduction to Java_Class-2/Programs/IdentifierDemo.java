class IdentifierDemo 
{
	public static void main(String[] args) 
	{
		// Valid Identifiers
		int age = 25;  // uses only lowercase Letters
		int _marks = 90;  //Begins with underscore _ allowed
		int $salary = 50000;  //Begins with dollar sign - allowed
		int marks1 = 85;  //includes digits, but not at the start - valid
		int Age = 30;  // Same name as 'age' but with capital A - valid & Different
		
		 // Invalid identifiers  Uncommenting these lines will cause compilation errors

                // int 2ndValue = 10;    // Invalid: Starts with digit (not allowed)
                // int for = 5;          // Invalid: 'for' is a reserved keyword in Java
                // int class = 100;      // Invalid: 'class' is a keyword
		
		//Displaying valid identifiers values
		System.out.println("age: " + age);
		System.out.println("_marks: " + _marks);
		System.out.println("$salary: " + $salary);
		System.out.println("Marks1: " + marks1);
		System.out.println("Age(Capital A): " + Age);

	}
}
