public class Macau extends Birds {
    public Macau(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Tweet!");
    }

    @Override
    public void showInfo() {
        System.out.println("Macau - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
