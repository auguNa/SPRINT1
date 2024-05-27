package S1_01.N3Ejercicio1;

public class NewsFootball extends News {
    private static int counter = 1;
    private final int ID;
    private String competition;
    private String club;
    private String player;

    public NewsFootball(String owner, String competition, String club,
                        String player) {
        super(owner);
        this.competition = competition;
        this.club = club;
        this.player = player;
        this.ID = counter++;
        calculatePriceNews();
        calculatePunctuation();
    }

    public void calculatePriceNews() {
        this.price = 300;
        if (competition.equalsIgnoreCase("Liga de Campeones")) {
            price += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 100;
        }
        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            price += 50;
        }
        setPrice(price);
    }

    @Override
    public void calculatePunctuation() {
        int punctuation = 5;
        if (competition.equalsIgnoreCase("Liga de Campeones")) {
            punctuation += 3;
        } else if (competition.equalsIgnoreCase("Liga")) {
            punctuation += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            punctuation += 1;
        }
        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            punctuation += 1;
        }
        setPunctuation(punctuation);
    }

    public int getId() {
        return ID;
    }

    @Override
    public String toString() {
        return "NewsFutbol{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                ", owner='" + owner + '\'' +
                ", text='" + text + '\'' +
                ", punctuation=" + punctuation +
                ", price=" + price +
                '}';
    }
}





