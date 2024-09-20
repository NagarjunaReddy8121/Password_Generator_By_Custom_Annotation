public class Test {
    public static void main(String[] args) throws IllegalAccessException {

        UserAccount userAccount=new UserAccount();

        RandomPasswordProcessorReflection.process(userAccount);

        System.out.println("Random Password:" + userAccount.getPassword());
    }
}
