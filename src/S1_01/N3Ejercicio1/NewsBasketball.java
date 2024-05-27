package S1_01.N3Ejercicio1;

public class NewsBasketball extends News {
    private String competition;
    private String club;
    private static int counter = 1;
    private final int id;

    public NewsBasketball(String owner, String competition, String club) {
        super(owner);
        this.competition    = competition;
        this.club           = club;
        this.id             = counter ++;
        calculatePriceNews();
        calculatePunctuation();
    }
    public int getId() {
        return id;
    }
    @Override
    public void calculatePriceNews() {
        this.price = 250;
        if (competition.equalsIgnoreCase("Euroliga")) {
            price += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 75;
        }
        setPrice(price);
    }

    @Override
    public void calculatePunctuation() {
        int punctuation = 4;
        if (competition.equalsIgnoreCase("Euroliga")) {
            punctuation += 3;
        } else if (competition.equalsIgnoreCase("ABC")) {
            punctuation += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            punctuation += 1;
        }
        setPunctuation(punctuation);
    }

    @Override
    public String toString() {
        return "NewsBasketball{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", id=" + id +
                ", owner='" + owner + '\'' +
                ", text='" + text + '\'' +
                ", punctuation=" + punctuation +
                ", price=" + price +
                '}';
    }
}
