
public class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal() {
    }

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice(){
        return "Voice";
    }

    public void eat(){
        System.out.println("Eat");
    }

    public void sleep(){
        System.out.println("Sleep");
    }

    @Override
    public String toString() {
        String result = "Animal[";
        if (ration != null) result += ration + " ";
        if (color != null) result += color + " ";
        if (weight != 0) result += weight;
        result += "]";
        return result;
    }
}
