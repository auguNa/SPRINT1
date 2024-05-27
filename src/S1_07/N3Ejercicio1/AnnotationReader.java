package S1_07.N3Ejercicio1;

public class AnnotationReader {
    public static void main(String[] args) {
        // Get the class where the annotation is applied (e.g., Person)
        Class<Person> personClass = Person.class;

        // Check if the annotation is present
        if (personClass.isAnnotationPresent(JsonSerializable.class)) {
            // Get the annotation instance
            JsonSerializable annotation = personClass.getAnnotation(JsonSerializable.class);

            // Read annotation values
            String directory = annotation.directory();

            // Print annotation information
            System.out.println("JsonSerializable annotation information:");
            System.out.println("Directory: " + directory);
        } else {
            System.out.println("JsonSerializable annotation not present on class: " + personClass.getName());
        }
    }
}

