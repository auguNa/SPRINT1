package S1_07.N3Ejercicio1;

public class AnnotationReader {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;

        if (personClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = personClass.getAnnotation(JsonSerializable.class);

            String directory = annotation.directory();

            System.out.println("JsonSerializable annotation information:");
            System.out.println("Directory: " + directory);
        } else {
            System.out.println("JsonSerializable annotation not present on class: " + personClass.getName());
        }
    }
}

