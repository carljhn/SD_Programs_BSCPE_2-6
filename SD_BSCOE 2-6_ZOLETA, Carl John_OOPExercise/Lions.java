public class Lions extends Mammals {
    public Lions(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak(){
        System.out.println("Roar!");
    }

    @Override
    public void showInfo(){
        System.out.println("Lion - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
