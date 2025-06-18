public class StringDemo5 {
    //Immutability in String
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" Prathamesh");  //new object created, bt not stored
        System.out.println(str); //"Hello" (not modified)

        str = str.concat(" Prathamesh");  // now Assigning
        System.out.println(str);  //"Hello Prathamesh"
    }
}
