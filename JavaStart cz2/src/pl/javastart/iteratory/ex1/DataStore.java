package pl.javastart.iteratory.ex1;


public class DataStore {

    private String name;
    private String age;

    public DataStore(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "imię: " + name + ", wiek: " + age;
    }
}
