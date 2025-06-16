public class UserProfile {
    private String email;
    private String password;

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public static void main(String[] args) {
        UserProfile u = new UserProfile();
        u.setEmail("prathameshaj123@gmail.com");
        u.setPassword("Prathamesh@123");
        System.out.println("Email: " + u.getEmail());
        System.out.println("Password: " + u.getPassword());
    }
}
