import lombok.Getter;
import lombok.val;
class MixGetterVal {
  private @Getter int x;
  MixGetterVal() {
    super();
  }
  public void m(int z) {
  }
  public void test() {
    final @val int y = x;
    m(y);
  }
  public @java.lang.SuppressWarnings("all") int getX() {
    return this.x;
  }
}