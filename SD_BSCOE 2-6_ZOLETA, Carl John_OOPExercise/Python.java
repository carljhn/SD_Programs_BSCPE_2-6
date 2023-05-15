public class Python extends Reptiles {
    public Python(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Hisss!");
    }

    @Override
    public void showInfo() {
        System.out.println("Python - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
