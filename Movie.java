import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//*************************************************************************
class Manager{
  public static Scanner in = new Scanner(System.in);
  public static int print_menu(){
    
    int choice;
    
    do // Validation 
    {
    System.out.println("***************************************************");
    System.out.println("Select your applicable choice: ");
    System.out.println("1: For a Manager Only: Add movie ");
    System.out.println("2: For a Manager Only: Remove movie ");
    System.out.println("3: Search movie ");
    System.out.println("4: Sort movie ");
    System.out.println("5: Terminate/End the Session ");
    
      choice = in.nextInt();
      in.nextLine();
      
      if (choice <1 || choice > 5)
      {
        System.out.println("Invalid choice\n");
      }
    }while (choice <1 || choice > 5);
      return choice;
  }

  public static void main(String[] args){
   
    MovieManager manager = new MovieManager("Manager", "Password");
    
    int choice = 0;
 
    while(choice != 5){
      choice = print_menu();
      
      switch(choice){
        case 1:
          System.out.print("Enter your password : ");
          String addMoviePwd = in.nextLine();
          manager.add_movie(addMoviePwd);
          break;
        case 2:
          System.out.print("Enter your password : ");
          String removeMoviePwd = in.nextLine();
          manager.remove_movie(removeMoviePwd);
          break;
        case 3:
          manager.search_movie();
          break;
        case 4:
          manager.sort_movie();
          break;
        case 5:
          System.out.println("Thank you for checking in with our movie store");
      }
          manager.print_list();
    }

  } 
} // main class Movie
//************************************************************************

  class Movie{ 

  private String title;
  private String actor;
  private String actress;
  private String genre;
  private String year;
  
//constructor to initialise the private members.
  public Movie(String title , String actor , String actress , String genre , String year){
    this.title = title;
    this.actor = actor;
    this.actress = actress;
    this.genre = genre;
    this.year = year;
  }
  public Movie(String title , String genre , String year){
    this(title , "" , "" , genre , year);
}
  public Movie(String title){
    this(title , "" , "" , "" , "");
  }
    
//getter fucntions.
  public String get_title(){ 
    return this.title;
  }
  public String get_actor(){ 
    return this.actor;
  }
  public String get_actress(){ 
    return this.actress;
  }
  public String get_genre(){ 
    return this.genre;
  }
  public String get_year(){ 
    return this.year;
  }
  public void print_movie(){
    
    System.out.println(this.title + " " + this.actor + " " + this.actress + " " + this.genre + " " + this.year);
  }
}

//*****************************************************************************************************

class MovieManager{
//private ArrayList of movie objects.
  private ArrayList<Movie> movies = new ArrayList<Movie>();
  private String password;
  private String username;
  public static Scanner in = new Scanner(System.in); // input keyboard

//constructor to initialise the password and username.
  public MovieManager(String username , String password){
    this.username = username;
    this.password = password;
  }

//getter functions.
  public String get_username(){
    return this.username;
  }
  public String get_password(){
    return this.password;
  }

// private function to add a movie into the private array of movies and can only be accessed when password is correct.
  private void add_movie_core(){
    String title ;
    String actor ;
    String actress ;
    String genre;
    String year ;
    
    System.out.print("Title Name : ");
    title = in.nextLine();
    
    System.out.print("\nActor Name : ");
    actor = in.nextLine();
    
    System.out.print("\nActress Name : ");
    actress = in.nextLine();
    
    System.out.print("\nGenre Type : ");
    genre = in.nextLine();
    
    System.out.print("\nReleased year : ");
    year = in.nextLine();
    
    Movie movie = new Movie(title , actor , actress, genre , year);
    this.movies.add(movie);
    System.out.println("Detected!! New movie has been added in the Movie Store");
  }
  
// private function to remove a movie from the private array of movies and can only be accessed when password is correct.
  private void remove_movie_core(){
   
    String title;
    boolean is_found = false;
    
    System.out.print("To delete a movie, type the name of the movie in the movie store : ");
    title = in.nextLine();
    
    for(int i=0 ; i<this.movies.size() ; i++){
      if(this.movies.get(i).get_title().compareTo(title) == 0){
        this.movies.remove(i);
        System.out.println(title + " movie has been deleted \n");
        
        is_found = true;
        break;
      }
    }
    if(! is_found){
      System.out.println(title + "not found \n");
    }
  }
  
//This function checks if password match and if they do match, it adds the function 
  public void add_movie(String password){
    if(this.password.compareTo(password) == 0){
      this.add_movie_core();
    }
    else{
      System.out.println("Wrong password, can't access to add a movie\n");
    }
  }
  
//This function checks if password match and if they do match it removes the fucntion.
  public void remove_movie(String password){
    if(this.password.compareTo(password) == 0){
      this.remove_movie_core();
    }
    else{
      System.out.println("Wrong password, can't access to remove a movie\n");
    }
  }
  
//Search method for a movie in the list.
  public void search_movie(){
    boolean is_found = false;
    System.out.print("To search a movie, type the name of the movie : ");
    String title = in.nextLine();
    
    for (Movie value : this.movies) {
      if (value.get_title().compareTo(title) == 0) {
        value.print_movie();
        is_found = true;
        break;
      }
    }
    
    if(!is_found){
      System.out.println("Movie" + title + " not found\n");
    }
  }
  
  public void print_list(){
    for (Movie movie : this.movies) {
            movie.print_movie();
    }
  }
  
//Method to sort the list.
  public void sort_movie(){
    int choice;//input the sorting attribute choice 
    System.out.println("Enter your choice : ");
    System.out.println("1: title\n2: Actor\n3: Actress\n4: Genre\n5: Year");
    choice = in.nextInt();
    //call the in-built sort function of the list , passing the comparator as attributes of both objects.
    switch(choice){
        case 1:
                this.movies.sort(Comparator.comparing(Movie::get_title));
                break;
            case 2:
                this.movies.sort(Comparator.comparing(Movie::get_actor));
                break;
            case 3:
                this.movies.sort(Comparator.comparing(Movie::get_actress));
                break;
            case 4:
                this.movies.sort(Comparator.comparing(Movie::get_genre));
                break;
            case 5:
                this.movies.sort(Comparator.comparing(Movie::get_year));
                break;
        }

        for (Movie movie : this.movies) {
            movie.print_movie();
        }
    }
}



