import java.util.ArrayList;

public class HungerGames {
  public static void main(String[] args){
    int deceasedIndex; // index of deceased tribute
    String deceased;   // name of deceased tribute
    ArrayList<String> tributes = new ArrayList<>();
    tributes.add("Cato");
    tributes.add("Katniss");
    tributes.add("Peeta");
    tributes.add("Rue");
    tributes.add(1, "Finnick");
    deceasedIndex = (int) (Math.random() * tributes.size());
    deceased = tributes.remove(deceasedIndex);
    System.out.println(deceased + " is no longer in the game.");
    System.out.println("Remaining: " + tributes);
  } // end main
} // end HungerGames
