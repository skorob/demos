package threadsfairy;

/**
 * Created by Oleg Skorobogatov on 23.03.2016.
 */
public class Reader implements Runnable {

    private PricesInfo pricesInfo;

    public Reader(PricesInfo priceInfo) {
        this.pricesInfo = priceInfo;
    }


    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.printf("%s: Price 1: %f\n", Thread.
                    currentThread().getName(),pricesInfo.getPrice1());
            System.out.printf("%s: Price 2: %f\n", Thread.
                    currentThread().getName(),pricesInfo.getPrice2());
        }
    }
}
