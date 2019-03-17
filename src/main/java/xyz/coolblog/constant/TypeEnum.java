package xyz.coolblog.constant;

public interface  TypeEnum<T> {
    T getCode();
    T find(T code);
}
