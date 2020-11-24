package test;
import test.T;
public class Main {
  public static void main(String[] args) { run(); }

  public static <A> void run() {
    Runnable r = () -> {
        T<A> t = new T<>(){};
        if(t.type == null) throw new IllegalStateException();
    };
    r.run();
  }
}
