package pl.javastart.lambda;

@FunctionalInterface
public interface Incremental<T> {
    T incr(T t);
}
