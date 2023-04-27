import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;
import idcard.TvFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();

        Factory tvFactory = new TvFactory();
        Product jonghyun = tvFactory.create("jonghyun");
        Product k = tvFactory.create("k");
        jonghyun.use();
        k.use();
        ((TvFactory)tvFactory).getProductList().forEach(Product::use);
    }
}
