public class Crocodile extends Reptiles {
    public Crocodile(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Arrgh!");
    }

    @Override
    public void showInfo() {
        System.out.println("Crocodile - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
