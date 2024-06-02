package S1_07.N2Ejercicio1;

import java.io.File;

@JsonSerializable(directory = "src/S1_07/N2Ejercicio1")

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
