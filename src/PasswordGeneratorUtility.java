import java.util.Random;

public class PasswordGeneratorUtility {

    public static String randomPasswordGenerator(int length){
        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random=new Random();
        StringBuilder password=new StringBuilder();

        for (int i=0;i<length;i++){
            password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
    }
}
