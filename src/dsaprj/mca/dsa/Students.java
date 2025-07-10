package dsaprj.mca.dsa;

public class Students {

    public static void main(String[] args) {

        product p1 = new product("Desktop", 1200);
        product p2 = new product("Desktop", 1200);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
    }

   }