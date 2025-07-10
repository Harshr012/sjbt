package dsaprj.mca.dsa;

public class product {

    static int prdId;  // ✅ moved outside main
    String prdName;
    double prdPrice;

    public product(String prdName, double prdPrice) {
        super();
        this.prdName = prdName;
        this.prdPrice = prdPrice;
    }

    @Override
    public String toString() {
        return "product [prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
    }

    public static void main(String[] args) {
        product p1 = new product("Desktop", 1200);
        product p2 = new product("Laptop", 1500);

        System.out.println(p1);
        System.out.println(p2);
    }
}