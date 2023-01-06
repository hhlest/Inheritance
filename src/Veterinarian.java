
public class Veterinarian {

    private String name;

    public Veterinarian() {
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment(Animal an) {
        System.out.println("Patient is " + an);
    }

    @Override
    public String toString() {
        return "Veterinarian" + "[" + name + "]";
    }
}

