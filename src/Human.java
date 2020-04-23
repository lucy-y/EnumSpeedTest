import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Human {
    UNKNOWN(0, "NO RESULT"),
    BOY(1, "소년"),
    GIRL(2, "소녀");

    private Human(int a, String b){
        this.a = a;
        this.b = b;
    }

    private final int a;
    private final String b;

    public int getA(){
        return this.a;
    }
    public String getB(){
        return this.b;
    }

    // for
    public static String get(int a){
        String result = "";
        for(Human h : Human.values()){
            if(h.getA() == a){
                result = h.getB();
                return result;
            }
        }
        return result;
    }

    //Arrays.stream
    public static String findArray(int a){
        return Arrays.stream(values())
                .filter(human -> human.a == a)
                .findAny()
                .orElse(UNKNOWN)
                .getB();
    }

    //Stream.of
    public static String findStream(int a){
        return Stream.of(values())
                .filter(human -> human.a == a)
                .findAny()
                .orElse(UNKNOWN)
                .getB();
    }

    //HashMap
    private static final Map<Integer, Human> humanMap =
            Collections.unmodifiableMap(Stream.of(values())
                    .collect(Collectors.toMap(Human::getA, Function.identity())));

    public static String findHashMap(int a){
        return Optional.ofNullable(humanMap.get(a).getB()).orElse(UNKNOWN.getB());
    }
}