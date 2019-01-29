
//lazy Sengleton
public class Sengleton {
    static private  Sengleton inst = new Sengleton() ;
    
     private  Sengleton() {}
     
   static Sengleton getInest(){return inst;}
}

