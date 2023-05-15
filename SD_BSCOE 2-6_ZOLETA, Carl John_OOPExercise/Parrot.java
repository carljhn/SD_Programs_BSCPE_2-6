public class Parrot extends Birds {
    public Parrot(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Squawk!");
    }

    @Override
    public void showInfo() {
        System.out.println("Parrot - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
