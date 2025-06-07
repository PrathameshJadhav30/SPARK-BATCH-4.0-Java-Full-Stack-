class NestedIfElse 
{
	public static void main(String[] args) 
	{
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
