public class StringPoolHeap {
    public static void main(String[] args) {
        String poolstring1 = "Prathamesh";
        String poolstring2 = "Prathamesh";
        String heapstring = new String("Prathamesh");

        System.out.println(poolstring1 == poolstring2); //true
        System.out.println(poolstring1 == heapstring);  //false
    }
}
