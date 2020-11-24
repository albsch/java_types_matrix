package test;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Token class which saves the type with generics at runtime.
 */
public abstract class T<X> {

    public final Type type;

    public T() {
        this.type = resolveType();
    }

    // this resolves and saves the type with generics at runtime
    public Type resolveType() {
        final Type genericSuperclass = getClass().getGenericSuperclass();
        final ParameterizedType parameterizedGenericSuperclass = (ParameterizedType) genericSuperclass;
        final Type[] actualTypeArguments = parameterizedGenericSuperclass.getActualTypeArguments();
        return actualTypeArguments[0];
    }
}
