public class Gorilla extends Mammals {
    public Gorilla(String name, int age, String gender){
        super(name, age, gender);
    }

    @Override
    public void speak(){
        System.out.println("Rawwwr!");
    }

    @Override
    public void showInfo(){
        System.out.println("Gorilla - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
