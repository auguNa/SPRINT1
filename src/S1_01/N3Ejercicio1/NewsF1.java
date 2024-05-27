package S1_01.N3Ejercicio1;

import java.util.Objects;

public class NewsF1 extends News {
    private static int counter = 1;
    private final int id;
    private String team;

    public NewsF1(String owner, String team) {
        super(owner);
        this.team = team;
        this.id = counter++;
        calculatePriceNews();
        calculatePunctuation();
    }

    @Override
    public void calculatePriceNews() {
        this.price = 100;
        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            price += 50;
        }
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    @Override
    public void calculatePunctuation() {
        int punctuation = 4;
        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            punctuation += 2;
        }
        setPunctuation(punctuation);
    }

    @Override
    public String toString() {
        return "NewsF1{" +
                "team='" + team + '\'' +
                ", owner='" + owner + '\'' +
                ", text='" + text + '\'' +
                ", punctuation=" + punctuation +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsF1 newsF1)) return false;
        return id == newsF1.id && Objects.equals(team, newsF1.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, id);
    }
}
