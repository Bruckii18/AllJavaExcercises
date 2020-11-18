import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger count1 = new AtomicInteger();
        AtomicInteger primCount = new AtomicInteger();
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 99999999 + 1);
            numberList.add(randomNum);
        }

        numberList.stream().parallel()
                .forEachOrdered(number -> {
                    System.out.print(count1.getAndIncrement() + ": " + number);
                    try {
                        boolean isItPrim = CompletableFuture.supplyAsync(() -> {
                            for (int i = 2; i < number; i++) {
                                if ((number%i) == 0)
                                   return false;
                            }
                            primCount.getAndIncrement();
                            return true;
                        }).get();
                        if (isItPrim)
                            System.out.println(" is prim");
                        else
                            System.out.println(" is not prim");
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    };
                });
        System.out.println("There were "+primCount+"/100 primnumbers.");
    }
}
