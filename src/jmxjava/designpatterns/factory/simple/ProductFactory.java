package jmxjava.designpatterns.factory.simple;

/**
 * 小米工厂
 * 生产
 */
public class ProductFactory {

    public static Product produce(String what) {
        switch (what) {
            case "tv":
                return new Tv();
            case "miband":
                return new MiBand();
            case "phone":
                return new Phone();
        }
        return null;
    }

    public static void main(String[] args) {
        ProductFactory.produce("tv");

    }

}
