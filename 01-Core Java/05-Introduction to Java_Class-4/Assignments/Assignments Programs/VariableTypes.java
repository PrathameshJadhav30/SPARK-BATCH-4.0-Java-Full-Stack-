public class VariableTypes {
    int instanceVar = 10;
    static int staticvar = 20;

    void Show(){
        int LocalVar = 30;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: "+ staticvar);
        System.out.println("Local Variable: "+ LocalVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.Show();
    }
}
