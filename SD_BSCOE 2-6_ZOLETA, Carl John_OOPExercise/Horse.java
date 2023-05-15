public class Horse extends Mammals {
    public Horse(String name, int age, String gender){
        super(name, age, gender);
    }

    @Override
    public void speak(){
        System.out.println("Neigh!");
    }

    @Override
    public void showInfo(){
        System.out.println("Horse - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
