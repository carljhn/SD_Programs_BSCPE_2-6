public class Iguana extends Reptiles {
    public Iguana(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Chirp!");
    }

    @Override
    public void showInfo() {
        System.out.println("Iguana - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
