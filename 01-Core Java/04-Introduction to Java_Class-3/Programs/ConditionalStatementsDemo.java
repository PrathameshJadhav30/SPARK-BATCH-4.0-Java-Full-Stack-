class ConditionalStatementsDemo
{
	public static void main(String[] args) 
	{
		int num = 75;

        // 1. Simple if
        System.out.println("1. Simple if:");
        if (num > 50) {
            System.out.println("Number is greater than 50");
        }

        // 2. if-else
        System.out.println("\n2. if-else:");
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // 3. else-if ladder
        System.out.println("\n3. else-if ladder:");
        if (num >= 90) {
            System.out.println("Grade: A");
        } else if (num >= 80) {
            System.out.println("Grade: B");
        } else if (num >= 70) {
            System.out.println("Grade: C");
        } else if (num >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // 4. Nested if-else
        System.out.println("\n4. Nested if-else:");
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Allowed entry");
            } else {
                System.out.println("Entry denied: No ID");
            }
        } else {
            System.out.println("Entry denied: Underage");
        }
	}
}
