class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg){
        super(msg);
    }
}

public class MarksDemo {
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100){
            throw new InvalidMarksException("Marks must be between 0 to 100");
        }
        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            validateMarks(120);
        } catch (InvalidMarksException e){
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
