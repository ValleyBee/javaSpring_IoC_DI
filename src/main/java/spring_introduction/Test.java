package spring_introduction;

public class Test {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();
        System.out.println(pet.getClass());
        pet = new Cat();
        pet.say();
        System.out.println(pet.getClass());
    }

}
