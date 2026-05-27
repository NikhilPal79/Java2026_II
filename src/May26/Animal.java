package May26;

public class Animal {
    String name;


    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    static void main(String[] args) {
        Animal animal = new Animal("Dog");
        System.out.println(animal.toString());


        String s = "Tommy";
        System.out.println(s.toString());
    }
}
