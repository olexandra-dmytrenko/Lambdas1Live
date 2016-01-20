package lambdas;

/**
 * Created by olexandra on 1/20/16.
 */
public class IntefacesMathOp {

    public static void main(String[] args) {
        MathOp add = (a, b) ->  a + b;
        //   MathOp add = (a, b) -> {return a + b;};
        //   MathOp add2 = (a, b, c) -> {return a + b;};
        System.out.println(add.operation(3, 5));
   //     System.out.println(add.operation2(3, 5));

    }

    interface MathOp{
        int operation(int a, int b);

   //     int operation2(int i, int i1, int i3);
        default void op2(){

        }
    }

    class MathOpAdd implements MathOp{

        @Override
        public int operation(int a, int b) {
            return a + b;
        }
    }
}
