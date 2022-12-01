package recap;

public class Animal {

    public Animal(String name, int age, double height, double weight, String diet) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.diet = diet;
    }

    public Animal(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct) {
        this(name, age, height, weight, diet);
        this.isAlive = isAlive;
        this.isExtinct = isExtinct;
    }

    public String name;
    public int age;
    public double height;
    public double weight;
    public String diet; // carnivore, omnivore, herbivore
    public boolean isAlive;
    public boolean isExtinct;

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                (isAlive ? ", age=" + age : "") +
                ", height=" + height +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                ", isAlive=" + isAlive +
                ", isExtinct=" + isExtinct +
                '}';
    }

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        System.out.println("Not alive = " + animal);
//        animal.isAlive = true;
//        System.out.println("Alive = " + animal);

        Animal animal = new Animal("Trex", 5, 7.4, 400.2, "carnivore", false, true);
        System.out.println(animal);
    }
}
