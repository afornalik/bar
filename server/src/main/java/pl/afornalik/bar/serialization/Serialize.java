package pl.afornalik.bar.serialization;

public interface Serialize<T> {

    byte[] serialize(T t);
}
