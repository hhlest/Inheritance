
public class Cat extends Animal {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice(){
        return "meow-meow";
    }

    @Override
    public void eat(){
        System.out.println("Cat eats");
    }

    @Override
    public void sleep(){
        System.out.println("Cat sleeps");
    }

    @Override
    public String toString() {
        return "Cat" + "[" + name + "]" + " " + super.toString();
    }
}
