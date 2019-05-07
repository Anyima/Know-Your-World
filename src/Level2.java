import java.util.Scanner;

public class Level2 {
    private String[] letter;
    private int[] number;
    private Country[] countries;
    private Scanner input;

    public Level2(int games) {
        System.out.println("Level 2!");
        input = new Scanner(System.in);
        letter = new String[games];
        number = new int[games];
        countries = new Country[]{new Country("China", "Beijing"),
                new Country("Brazil", "Brasilia")};
        for (int i = 0; i < letter.length; i++) {
            Country randomCountry  = countries[(int)(Math.random() * countries.length)];
            letter[i] = randomCountry.getCountryInitial();
            number[i] = randomCountry.getCountryNameLength();
        }
    }

    public void playLevel2() {
        for (int i = 0; i < letter.length; i++) {
            System.out.println("Enter a country with the initial " + letter[i] +" and has " + number[i]+ " letters:");
            if (!correctResponse(input.nextLine(), letter[i], number[i] )){
                System.out.println("Wrong!");
                System.exit(0);
            }
        }
    }

    public boolean correctResponse(String country, String initial, int length) {
        for (Country c: countries) {
            if (c.getCountryName().equals(country) && initial.equals(country.substring(0,1)) && country.length() == length){
                return true;
            }
        }
        return false;
    }
}
