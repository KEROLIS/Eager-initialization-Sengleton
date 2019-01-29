
public class SingletonTest {
    public static void main(String[] args) {
        Sengleton s1=Sengleton.getInest();
        Sengleton s2=Sengleton.getInest();
        System.out.println(s1==s2);
    }

}