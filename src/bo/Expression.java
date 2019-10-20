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

        System.out.println("Ma stack : " + stackE);
        calculExpression(stackE);
        String stackTab;
        stackTab = stackE.get(0) + stackE.get(1) + stackE.get(2) + stackE.get(3) + stackE.get(4);
        System.out.println(stackTab);
        return stackE;
    }

    public void calculExpression(Stack<String> stackE ) {
        int stackInt;
        stackE.pop();
        System.out.println("Stack dans calcul :" + stackE);
       /* for (int i=0; i<=5; i++){
            System.out.println("=== Avant pop === " );
            stackTab = stackE.peek();
            stackInt = Integer.parseInt(stackTab) ;
            stackE.pop();
            System.out.println("Stack apres pop : " + stackE.get(3));
        }*/
       //stackInt = Integer.parseInt(stackE.get(0)) + Integer.parseInt(stackE.get(1));




    }
}
