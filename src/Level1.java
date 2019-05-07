import java.util.Scanner;

public class Level1 {
    private String[] letter;
    private Country[] countries;
    private Scanner input;

    public Level1(int games) {
        System.out.println("Level 1!");
        input = new Scanner(System.in);
        letter = new String[games];
        countries = new Country[]{new Country("China", "Beijing"),
        new Country("Brazil", "Brasilia")};
        for (int i = 0; i < letter.length; i++) {
            letter[i] = countries[(int)(Math.random() * countries.length)].getCountryInitial();
        }
    }

    public void playLevel1() {
        for (String i: letter) {
            System.out.println("Enter a country with the letter " + i +":");
            if (!correctResponse(input.nextLine(), i)){
                System.out.println("Wrong!");
                System.exit(0);
            }
        }
    }

    public boolean correctResponse(String country, String initial) {
        for (Country c: countries) {
            if (c.getCountryName().equals(country) && initial.equals(country.substring(0,1))){
                return true;
            }
        }
        return false;
    }
}
