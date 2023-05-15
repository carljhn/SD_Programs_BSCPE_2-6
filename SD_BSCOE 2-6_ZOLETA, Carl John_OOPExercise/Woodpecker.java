public class Woodpecker extends Birds {
    public Woodpecker(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Chwirp!");
    }

    @Override
    public void showInfo() {
        System.out.println("Woodpecker - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
