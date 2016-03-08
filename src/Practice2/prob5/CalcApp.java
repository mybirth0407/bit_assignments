package Practice2.prob5;

import java.util.Scanner;

 public class CalcApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자 입력: ");
        /* 입력 예시 2 3 +
         * 결과 5 */

        int x = sc.nextInt();
        int y = sc.nextInt();
        String operand = sc.next();

        if (operand.equals("+")) {
            Arith a = new Add();
            a.setValue(x, y);
            System.out.println(a.calculate());
        }
        else if (operand.equals("-")) {
            Arith s = new Sub();
            s.setValue(x, y);
            System.out.println(s.calculate());
        }
        else if (operand.equals("/")) {
            Arith d = new Div();
            d.setValue(x, y);
            System.out.println(d.calculate());
        }
        else if (operand.equals("*")) {
            Arith m = new Mul();
            m.setValue(x, y);
            System.out.println(m.calculate());
        }
        else {
            System.out.println("제대로 입력하렴");
        }
    }
}
