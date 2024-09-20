import java.lang.reflect.Field;

public class RandomPasswordProcessorReflection {
    public static void process(Object object) throws IllegalAccessException {
        Field[] fields=object.getClass().getDeclaredFields();

        for (Field field:fields){
            if (field.isAnnotationPresent(PasswordGenerator.class)){
                PasswordGenerator annotation=field.getAnnotation(PasswordGenerator.class);
                int length= annotation.length();
                String randomPassword=PasswordGeneratorUtility.randomPasswordGenerator(length);
                field.setAccessible(true);
                field.set(object,randomPassword);
            }
        }
    }
}
