package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TokenTest {

    @Test
    public <A> void typeGenericInLambda()  {
        assertDoesNotThrow(() -> {
            T<A> t = new T<>(){};
            assertNotNull(t.type);
        });
    }

    @Test
    public void typeInLambda()  {
        assertDoesNotThrow(() -> {
            T<Integer> t = new T<>(){};
            assertNotNull(t.type);
        });
    }

    @Test
    public <A> void justType()  {
        T<A> t = new T<>(){};
        System.out.println(t.type);
        assertNotNull(t.type);
    }
}
