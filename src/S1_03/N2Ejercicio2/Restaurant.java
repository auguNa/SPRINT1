package S1_03.N2Ejercicio2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    // Constructor
    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    // Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    // Implement compareTo
    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.score, other.score);
        }
    }

    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }
}