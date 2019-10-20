package bo;

import java.io.Serializable;
import java.util.Random;
import java.util.Stack;

public class Expression implements Serializable {
    public Expression() { generateExpression(); }


    public String generateExpression() {

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

        for (int i=0; i<=2; i++){
            
        }
        System.out.println("Ma stack : " + stackE);

        return null;
    }
}
