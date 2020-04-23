public class EnumTest {
    public static void main(String[] args) throws InterruptedException {
        System.err.println(Human.get(1));
        System.err.println(Human.findArray(0));
        System.err.println(Human.findStream(2));
        System.err.println(Human.findHashMap(2));

        int endNum = 1000000;
        // 속도측정
        speedFor(endNum);
        Thread.sleep(3000);
        speedArrayStream(endNum);
        Thread.sleep(3000);
        speedStream(endNum);
        Thread.sleep(3000);
        speedHashMap(endNum);

    }

    // for
    public static void speedFor(int endNum) {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while(i<endNum){
            Human.get(1);
            i++;
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.err.println("=== For ===");
        System.out.println("took " + estimatedTime + " ms");
    }
    //Arrays.stream
    public static void speedArrayStream(int endNum){
        long startTime = System.currentTimeMillis();
        int i = 0;
        while(i<endNum){
            Human.findArray(1);
            i++;
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.err.println("=== Arrays.stream ===");
        System.out.println("took " + estimatedTime + " ms");
    }
    //Stream.of
    public static void speedStream(int endNum){
        long startTime = System.currentTimeMillis();
        int i = 0;
        while(i<endNum){
            Human.findStream(1);
            i++;
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.err.println("=== Stream.of ===");
        System.out.println("took " + estimatedTime + " ms");
    }
    //HashMap
    public static void speedHashMap(int endNum) {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while(i<endNum){
            Human.findHashMap(1);
            i++;
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.err.println("=== HashMap ===");
        System.out.println("took " + estimatedTime + " ms");
    }
}