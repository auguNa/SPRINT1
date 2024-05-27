package S1_07.N3Ejercicio1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonSerializer {
    public static void serialize(Object obj) throws IOException {
        Class<?> objClass = obj.getClass();
        if (objClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objClass.getAnnotation(JsonSerializable.class);
            String directory = annotation.directory();
            File dir = new File(directory);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            String fileName = directory + File.separator + objClass.getSimpleName() + ".json";
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(fileName), obj);
            System.out.println("Serialized object to " + fileName);
        } else {
            throw new RuntimeException("The class " + objClass.getSimpleName() + " is not annotated with @JsonSerializable");
        }
    }
}

