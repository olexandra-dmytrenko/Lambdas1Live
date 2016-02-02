package lambdas;

import java.util.function.Supplier;

/**
 * Created by olexandra on 1/27/16.
 */
public class Lazy {
    public <R> R use(Supplier<R> supplier) {
        System.out.println("Start of use");
        R getUse = getR(supplier);
        System.out.println(getUse);
        System.out.println("End of use");
        return getUse;
    }

    private <R> R getR(Supplier<R> supplier) {
        return supplier.get();
    }

    public String getString(){
        System.out.println("I start getString");
        use( () -> {
            System.out.println("In getString in use");
            return "I'm return of getString";
        });
     return    "I'm done with get String method";
    }

    public void getVoid(String s){
        System.out.println("I start getString");
        use( () -> {
            System.out.println("In getString in use" + s);
            return "I'm return of getString";

        });
    }
    private String notUse(String s){
        return "s";
    }

    private String notGetString(String s){
        return notUse(s);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Lazy l = new Lazy();
        System.out.printf(l.getString());
    }
}
