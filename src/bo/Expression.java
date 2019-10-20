package bo;

import java.io.Serializable;
import java.util.Random;
import java.util.Stack;

public class Expression implements Serializable {
    public Expression() { generateExpression(); }


    public Stack generateExpression() {

        Random r = new Random();
        String operator = "?";
        Stack<String> stackE = new Stack<>();

        for (int i=0; i<=2; i++){
            int rand = (int)(Math.random()*49+1);
            stackE.push(Integer.toString(rand));
            switch (r.nextInt(4)){
                case 0:
                    operator = "+";
                    stackE.push(operator);
                    break;
                case 1:
                    operator = "-";
                    stackE.push(operator);
                    break;
                case 2:
                    operator = "/";
                    stackE.push(operator);
                    break;
                case 3:
                    operator = "*";
                    stackE.push(operator);
                    break;
            }
        }
       /* for (int i=0; i<=5; i++){
            stackE.pop();
            System.out.println("Ma stack + pop " + i + " : " + stackE);
        } */
        System.out.println("Ma stack : " + stackE);
        calculExpression(stackE);
        return stackE;
    }

    public void calculExpression(Stack<String> stack ) {
        System.out.println("Stack dans calcul :" + stack);

    }
}
