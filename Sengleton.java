
//lazy Sengleton
public class Sengleton {
  static private Sengleton inst;

  private Sengleton() {
  }

  static Sengleton getInest() {
    if (inst==null) {
      inst=new Sengleton();
    }
    return inst;
  }
}
