public class UserAccount {

    @PasswordGenerator(length = 10)
    private String password;

    public String getPassword(){
        return password;
    }
}

