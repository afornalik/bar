package pl.afornalik.bar.deserialization;

public interface Deserialization<T> {

    T deserialize(byte[] bytes);
}
