package lambdaTask1;

@FunctionalInterface
public interface Modify {
   public String replace(String content, char c, int index);
}
