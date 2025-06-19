public class CompareStrings {
    public static void main(String[] args) {
        long start, end;

        //string (Immutable)
        start = System.nanoTime();
        String s = "Java";
        for(int i = 0; i < 1000; i++){
            s += "Test";
        }
        end = System.nanoTime();
        System.out.println("String time: " + (end - start));

        //stringBuffer (Thread-safe)
        start = System.nanoTime();
        StringBuffer sb = new StringBuffer("Java");
        for(int i = 0; i < 1000; i++){
            sb.append("Test");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start));

        //stringBuilder (Faster, not Thread-safe)
        start = System.nanoTime();
        StringBuilder sb2 = new StringBuilder("Java");
        for(int i = 0; i < 1000; i++){
            sb2.append("Test");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start));
    }
}
