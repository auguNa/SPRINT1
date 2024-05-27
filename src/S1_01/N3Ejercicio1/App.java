package S1_01.N3Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Editor> editors = new ArrayList<>();
        /*Editor newEditor = new Editor("Tim", "123");
        editors.add(newEditor);
        NewsF1 newsF1 = new NewsF1("Augustin", "Ferrari");
        newEditor.getWrittenNews().add(newsF1);*/
        int option;
        do {
            System.out.println("1.- Create Editor");
            System.out.println("2.- Delete Editor");
            System.out.println("3.- Create Editor's News");
            System.out.println("4.- Delete news");
            System.out.println("5.- Show All Editor's News");
            System.out.println("6.- Calculate News Score");
            System.out.println("7.- Calculate News Price");
            System.out.println("0.- End the Application");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    createEditor(editors);
                    break;
                case 2:
                    deleteEditor(editors);
                    break;
                case 3:
                    createNews(editors);
                    break;
                case 4:
                    deleteNews(editors);
                    break;
                case 5:
                    showNews(editors);
                    break;
                case 6:
                    calculateNewsScore(editors);
                    break;
                case 7:
                    calculateNewsPrice(editors);
                    break;
                case 0:
                    System.out.println("Application ended.. ");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 0);
    }
    public static void createEditor(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the dni: ");
        String dni = sc.nextLine();

        Editor editor = findEditor(editors, dni);
        if (editor == null) {
            editor = createEditor(editors, dni);
            editors.add(editor);
            System.out.println("Editor.. successfully created");
        } else {
            System.out.println("The Editor Exists !");
        }
    }

    public static Editor findEditor(ArrayList<Editor> editors, String dni) {
        int i = 0;
        Editor editor = null;
        while (i < editors.size() && editor == null) {
            if (editors.get(i) instanceof Editor && editors.get(i).getDni().equalsIgnoreCase(dni)) {
                editor = (Editor) editors.get(i);
            }
            i++;
        }
        return editor;
    }

    public static Editor createEditor(ArrayList<Editor> editors, String dni) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the name: ");
        String name = sc.nextLine();
        Editor editor = new Editor(name, dni);
        return editor;
    }

    public static void deleteEditor(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI del redactor: ");
        String dni = sc.next();

        Editor editor = findEditor(editors, dni);
        if (editor != null) {
            editors.remove(editor);
            System.out.println("The editor has been deleted.");
        } else {
            System.out.println("The editor can't be found in the app.");
        }
    }

    public static void createNews(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type Editor DNI's: ");
        String dni = sc.next();

        Editor editor = findEditor(editors, dni);
        if (editor != null) {
            System.out.println("Enter the type of news: 1. Futboll || 2. Basketball || " +
                    "3. Tenis || 4. F1 || 5. Moto");
            int tipoNews = sc.nextInt();
            sc.nextLine();

            System.out.println("Type news ID: ");
            int id = sc.nextInt();

            switch (tipoNews) {
                case 1:
                    NewsFootball newsFootball = findNewsFutbol(editor.getWrittenNews(), id);
                    if (newsFootball == null) {
                        newsFootball = createNewsFutbol();
                        editor.createNews(newsFootball);
                        System.out.println("News futbol creada con exito.");
                    } else {
                        System.out.println("News existente!");
                    }
                    break;
                case 2:
                    NewsBasketball newsBasketball = findNewsBasketball(editor.getWrittenNews(), id);
                    if (newsBasketball == null) {
                        newsBasketball = createNewsBasketBall();
                        editor.createNews(newsBasketball);
                        System.out.println("Basketball news created !");
                    } else {
                        System.out.println("Basketball news has already been created");
                    }
                    break;
                case 3:
                    NewsTenis newsTenis = findNewsTenis(editor.getWrittenNews(), id);
                    if (newsTenis == null) {
                        newsTenis = createNewsTenis();
                        editor.createNews(newsTenis);
                        System.out.println("Tenis news created.");
                    } else {
                        System.out.println("Tenis news has already been created!");
                    }
                    break;
                case 4:
                    NewsF1 newsF1 = findNewsF1(editor.getWrittenNews(), id);
                    if (newsF1 == null) {
                        newsF1 = createNewsF1();
                        editor.createNews(newsF1);
                        System.out.println("F1 news created");
                    } else {
                        System.out.println("F1 news has already been created");
                    }
                    break;
                case 5:
                    NewsMoto newsMoto = findNewsMoto(editor.getWrittenNews(), id);
                    if (newsMoto == null) {
                        newsF1 = createNewsF1();
                        editor.createNews(newsMoto);
                        System.out.println("Moto news created");
                    } else {
                        System.out.println("Moto news has already been created");
                    }
                    break;
                default:
                    System.out.println("Option incorrecta");
            }
        }
    }

    public static NewsFootball findNewsFutbol(ArrayList<News> newsWritten, int id) {
        int i = 0;
        NewsFootball newsFootball = null;
        while (i < newsWritten.size() && newsFootball == null) {
            if (newsWritten.get(i) instanceof NewsFootball && ((NewsFootball) newsWritten.get(i)).getId() == id) {
                newsFootball = (NewsFootball) newsWritten.get(i);
            }
            i++;
        }
        return newsFootball;
    }

    public static NewsFootball createNewsFutbol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the news owner: ");
        String owner = sc.nextLine();

        System.out.print("Competition: ");
        String competitionFutbol = sc.nextLine();
        System.out.print("Club: ");
        String clubFutbol = sc.nextLine();
        System.out.print("Player: ");
        String playerFutboll = sc.nextLine();

        NewsFootball newsFootball = new NewsFootball(owner, competitionFutbol, clubFutbol, playerFutboll);
        return newsFootball;

    }

    public static NewsBasketball findNewsBasketball(ArrayList<News> newsWritten, int id) {
        int i = 0;
        NewsBasketball newsBasketball = null;
        while (i < newsWritten.size() && newsBasketball == null) {
            if (newsWritten.get(i) instanceof NewsBasketball && ((NewsBasketball) newsWritten.get(i)).getId() == id) {
                newsBasketball = (NewsBasketball) newsWritten.get(i);
            }
            i++;
        }
        return newsBasketball;
    }

    public static NewsBasketball createNewsBasketBall() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the news owner:: ");
        String owner = sc.nextLine();
        System.out.print("Competition: ");
        String competition = sc.nextLine();
        System.out.print("Club: ");
        String club = sc.nextLine();

        NewsBasketball newsBasketball = new NewsBasketball(owner, competition, club);
        return newsBasketball;

    }

    public static NewsTenis findNewsTenis(ArrayList<News> newsWritten, int id) {
        int i = 0;
        NewsTenis newsTenis = null;
        while (i < newsWritten.size() && newsTenis == null) {
            if (newsWritten.get(i) instanceof NewsTenis && ((NewsTenis) newsWritten.get(i)).getId() == id) {
                newsTenis = (NewsTenis) newsWritten.get(i);
            }
            i++;
        }
        return newsTenis;
    }

    public static NewsTenis createNewsTenis() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type news owner: ");
        String owner = sc.nextLine();
        System.out.print("Competition: ");
        String competition = sc.nextLine();
        System.out.print("Player: ");
        String player = sc.nextLine();

        NewsTenis newsTenis = new NewsTenis(owner, competition, player);
        return newsTenis;

    }

    public static NewsF1 findNewsF1(ArrayList<News> newsWritten, int id) {
        int i = 0;
        NewsF1 newsF1 = null;
        while (i < newsWritten.size() && newsF1 == null) {
            if (newsWritten.get(i) instanceof NewsF1 && ((NewsF1) newsWritten.get(i)).getId() == id) {
                newsF1 = (NewsF1) newsWritten.get(i);
            }
            i++;
        }
        return newsF1;
    }

    public static NewsF1 createNewsF1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type news owner: ");
        String owner = sc.nextLine();
        System.out.print("Team: ");
        String team = sc.nextLine();

        NewsF1 newsF1 = new NewsF1(owner, team);
        return newsF1;

    }

    public static NewsMoto findNewsMoto(ArrayList<News> newsWritten, int id) {
        int i = 0;
        NewsMoto newsMoto = null;
        while (i < newsWritten.size() && newsMoto == null) {
            if (newsWritten.get(i) instanceof NewsMoto && ((NewsF1) newsWritten.get(i)).getId() == id) {
                newsMoto = (NewsMoto) newsWritten.get(i);
            }
            i++;
        }
        return newsMoto;
    }

    public static NewsMoto createNewsMoto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type owner news: ");
        String owner = sc.nextLine();
        System.out.print("Moto Team: ");
        String team = sc.nextLine();

        NewsMoto newsMoto = new NewsMoto(owner, team);
        return newsMoto;

    }

    public static void deleteNews(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI del redactor: ");
        String dni = sc.next();

        Editor editor = findEditor(editors, dni);
        if (editor != null) {
            System.out.println("Enter the type of news: 1. Futboll || 2. Basketball || " +
                    "3. Tenis || 4. F1 || 5. Moto");
            int tipoNews = sc.nextInt();
            sc.nextLine();

            System.out.println("Type news ID: ");
            int id = sc.nextInt();

            switch (tipoNews) {
                case 1:
                    NewsFootball newsFootball = findNewsFutbol(editor.getWrittenNews(), id);
                    if (newsFootball != null) {
                        editor.deleteNews(newsFootball);
                        System.out.println("Football news deleted.");
                    } else {
                        System.out.println("News non-existent!");
                    }
                    break;
                case 2:
                    NewsBasketball newsBasketball = findNewsBasketball(editor.getWrittenNews(), id);
                    if (newsBasketball != null) {
                        editor.deleteNews(newsBasketball);
                        System.out.println("Basketball news deleted.");
                    } else {
                        System.out.println("News non-existent!");
                    }
                    break;
                case 3:
                    NewsTenis newsTenis = findNewsTenis(editor.getWrittenNews(), id);
                    if (newsTenis != null) {
                        editor.deleteNews(newsTenis);
                        System.out.println("Tenis news deleted.");
                    } else {
                        System.out.println("News non-existent!");
                    }
                    break;
                case 4:
                    NewsF1 newsF1 = findNewsF1(editor.getWrittenNews(), id);
                    if (newsF1 != null) {

                        editor.deleteNews(newsF1);
                        System.out.println("F1 news deleted.");
                    } else {
                        System.out.println("News non-existent!");
                    }
                    break;
                case 5:
                    NewsMoto newsMoto = findNewsMoto(editor.getWrittenNews(), id);
                    if (newsMoto == null) {
                        editor.deleteNews(newsMoto);
                        System.out.println("Moto news deleted");
                    } else {
                        System.out.println("News non-existent!");
                    }
                    break;
                default:
                    System.out.println("Incorrect option");
            }
        }
    }

    public static void showNews(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type redactor DNI's: ");
        String dni = sc.next();

        Editor editor = findEditor(editors, dni);
        if (editor != null) {
            System.out.println(editor.getWrittenNews());
        } else {
            System.out.println("The redactor is not in the app.");
        }
    }

    public static void calculateNewsScore(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type redactor DNI's: ");
        String dni = sc.next();
        System.out.println("Type news ID: ");
        int id = sc.nextInt();

        Editor editor = findEditor(editors, dni);
        if (editor != null) {
            ArrayList<News> newsWritten = editor.getWrittenNews();
            News news = null;
            for (int i = 0; i < newsWritten.size(); i++) {
                if (newsWritten.get(i).getId() == id) {
                    news = newsWritten.get(i);
                }
            }

            if (news != null) {
                System.out.println("The score of the news is: " + news.getPunctuation());
            } else {
                System.out.println("News with the given ID not found.");
            }
        } else {
            System.out.println("Editor with the given DNI not found.");
        }
    }

    public static void calculateNewsPrice(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type redactor DNI's: ");
        String dni = sc.next();
        System.out.println("Type news ID: ");
        int id = sc.nextInt();

        Editor editor = findEditor(editors, dni);
        if (editor != null) {
            ArrayList<News> newsWritten = editor.getWrittenNews();
            News news = null;
            for (int i = 0; i < newsWritten.size(); i++) {
                if (newsWritten.get(i).getId() == id) {
                    news = newsWritten.get(i);
                }
            }

            if (news != null) {
                System.out.println("The price of the news is: " + news.getPrice() + "€");
            } else {
                System.out.println("News with the given ID not found.");
            }
        } else {
            System.out.println("Editor with the given DNI not found.");
        }
    }


}


