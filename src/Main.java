import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args) {
        checkClass(Car.class);
    }

    private static void checkClass(Class myClass){
        Field[] fields=myClass.getDeclaredFields();
        for(Field field:fields){
            System.out.println("Field: "+field.getName()+" Type: "+field.getType());
        }
        Method[] methods=myClass.getDeclaredMethods();
        for(Method method:methods){
            System.out.println("Method: "+method.getName()+" Returns type: "+method.getReturnType());
        }
        Constructor[] constructors=myClass.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            System.out.println("Constructor number of parameters: "+constructor.getParameterCount());
            Parameter[] parameters=constructor.getParameters();
            for(Parameter parameter:parameters){
                System.out.println("Type of parameter: "+parameter.getType());
            }
        }
    }
}
