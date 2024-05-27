package S1_01.N3Ejercicio1;

import java.util.ArrayList;

public class Editor {
    private final String DNI;
    private String name;
    private static double salary = 1500;
    private ArrayList<News> writtenNews;

    public Editor(String name, String dni) {
        this.name = name;
        DNI = dni;
        this.writtenNews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<News> getWrittenNews() {
        return writtenNews;
    }

    public String getDni() {
        return DNI;
    }

    public double getSalary() {
        return salary;
    }

    public void createNews(News news) {
        writtenNews.add(news);
    }

    public void deleteNews(News news) {
        writtenNews.remove(news);
    }

    public String toString() {
        return "Editor" +
                "name='" + name + '\'' +
                ", dni='" + DNI + '\'' +
                ", salary=" + salary;
    }
}
