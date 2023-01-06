
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Milk", "Black", 10, "Tom");
        System.out.println(cat1);
        System.out.println(cat1.getVoice());
        cat1.eat();
        cat1.sleep();
        System.out.println(cat1.getWeight());

        Cat cat2 = new Cat("Dart");
        System.out.println(cat2);
        cat2.setColor("Grey");
        System.out.println(cat2);

        Dog dog1 = new Dog("Meat", "Brown", 12, "Ric");
        System.out.println(dog1);
        System.out.println(dog1.getName());
        cat1.eat();
        dog1.sleep();
        dog1.setName("Tor");
        System.out.println(dog1);

        Veterinarian veterinarian1 = new Veterinarian("Max");
        veterinarian1.treatment(cat1);
        veterinarian1.treatment(dog1);
    }
}
