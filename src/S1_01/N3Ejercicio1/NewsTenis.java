package S1_01.N3Ejercicio1;

public class NewsTenis extends News{
    private String competition;
    private String player;
    private static int counter = 1;
    private final int id;

    public NewsTenis(String owner, String competition, String player) {
        super(owner);

        this.competition = competition;
        this.player = player;
        this.id = counter ++;
        calculatePriceNews();
        calculatePunctuation();
    }
    public int getId() {
        return id;
    }
    @Override
    public void calculatePriceNews() {
        this.price = 150;
        if (player.equalsIgnoreCase("Federer, Navidad, Djokovic")) {
            price += 100;
        }
        setPrice(price);
    }


    @Override
    public void calculatePunctuation() {
        int punctuation = 4;
        if(player.equalsIgnoreCase("Federer, Navidad, Djokovic")){
            punctuation += 3;
        }
    }

    @Override
    public String toString() {
        return "NewsTenis{" +
                "competition='" + competition + '\'' +
                ", player='" + player + '\'' +
                ", owner='" + owner + '\'' +
                ", punctuation=" + punctuation +
                ", text='" + text + '\'' +
                ", price=" + price +
                '}';
    }
}
