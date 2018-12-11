package pl.javastart.lambda;

import java.util.function.Function;

public class F {

    String text = "    Agnieszka";
    String textNext = text.toUpperCase().trim();

    public static void main(String[] args) {
        F f = new F();

        System.out.println(f.text);
        System.out.println(f.textNext);

        System.out.println(f.modify(f.text));
        f.funcModify(" ROberT");
    }
    public String modify(String text) {
        return text.toUpperCase().trim();
    }
    public void funcModify(String s) {
        String textEmpty;
        Function<String, String> fx = (String text) -> text.toUpperCase().trim();
        textEmpty = fx.apply(s);
        System.out.println(textEmpty);
    }
}
