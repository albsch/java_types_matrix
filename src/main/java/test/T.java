package test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.function.Supplier;

/**
 * Token class which saves the type with generics at runtime.
 */
public abstract class T<X> implements Supplier<Type> {
	protected final Type type;
    public T() { this.type = resolveType(); }

    @Override public Type get() { return type; }

	// this resolves and saves the type with generics at runtime
	// enables reasoning about generics even with Java type erasure, to an extent
	protected Type resolveType() {
		final Type genericSuperclass = getClass().getGenericSuperclass();
		final ParameterizedType parameterizedGenericSuperclass = (ParameterizedType) genericSuperclass;
		final Type[] actualTypeArguments = parameterizedGenericSuperclass.getActualTypeArguments();
		return actualTypeArguments[0];
	}
}