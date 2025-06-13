class VariableTypes 
{
	int instanceVar = 10;       // Instance variable
    static int staticVar = 20;  // Static variable

    public void method() {
        int localVar = 30;      // Local variable
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
        System.out.println("Local: " + localVar);
    }
	public static void main(String[] args) 
	{
		VariableTypes obj = new VariableTypes();
        obj.method();
	}
}
