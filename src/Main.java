import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        checkClass(Car.class);
        createObjectOfClass(Car.class);
    }

    private static void createObjectOfClass(Class myClass) {
        try {
            Constructor constructor=myClass.getDeclaredConstructor(String.class,String.class,int.class);
            Car car=(Car)constructor.newInstance("BMW","X5",123456789);
            System.out.println(car);
            Method method=myClass.getMethod("getVinCode");
            int vinCode=(int)method.invoke(car);
            System.out.println("Vincode: "+vinCode);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
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
