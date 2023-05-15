public abstract class Zoo {
    private String animalName;
    private int animalAge;
    private String animalGender;

    public Zoo(String name, int age, String gender){
        this.animalName = name;
        this.animalAge = age;
        this.animalGender = gender;
    }

    public abstract void speak();
    public abstract void showInfo();

// for getters and setters
    // Animal Name
    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalName(String name){
        this.animalName = name;
    }

    // Animal Age
    public int getAnimalAge(){
        return animalAge;
    }

    public void setAnimalAge(int age){
        this.animalAge = age;
    }

    // Animal Gender
    public String getAnimalGender(){
        return animalGender;
    }

    public void setAnimalGender(String gender){
        this.animalGender = gender;
    }
}