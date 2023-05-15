public class Main {
    public static void main(String[] args) {
        Lions lion = new Lions("Leo", 8, "Male");
        lion.showInfo();
        lion.speak();
  
        Horse horse = new Horse("Ellie", 18, "Male");
        horse.showInfo();
        horse.speak();

        Gorilla gorilla = new Gorilla("Gorge", 21, "Malw");
        gorilla.showInfo();
        gorilla.speak();
  
        Python python = new Python("Charm", 8, "Female");
        python.showInfo();
        python.speak();
  
        Iguana iguana = new Iguana("Iggy", 4, "Male");
        iguana.showInfo();
        iguana.speak();

        Crocodile crocodile = new Crocodile("Cedie", 12, "Female");
        crocodile.showInfo();
        crocodile.speak();
       
        Macau macau = new Macau("Mackie", 3, "Female");
        macau.showInfo();
        macau.speak();
  
        Parrot parrot = new Parrot("Vivian", 6, "Female");
        parrot.showInfo();
        parrot.speak();

        Woodpecker woodpecker = new Woodpecker("Woody", 2, "Male");
        woodpecker.showInfo();
        woodpecker.speak();
    }
  }
  
  