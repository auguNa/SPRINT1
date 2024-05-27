package S1_01.N3Ejercicio1;

public class NewsMoto extends News {
    private String team;
    private static int counter = 1;
    private final int id;

    public NewsMoto(String owner, String team) {
        super(owner);
        this.team = team;
        this.id = counter ++;
        calculatePriceNews();
        calculatePunctuation();
    }

    @Override
    public void calculatePriceNews() {
        this.price = 100;
        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            price += 50;
        }
        setPrice(price);
    }

    @Override
    public void calculatePunctuation() {
        int punctuation = 3;
        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            punctuation += 3;
        }
        setPunctuation(punctuation);

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "NewsMotociclismo{" +
                "team='" + team + '\'' +
                ", owner='" + owner + '\'' +
                ", text='" + text + '\'' +
                ", punctuation=" + punctuation +
                ", price=" + price +
                '}';
    }
}
