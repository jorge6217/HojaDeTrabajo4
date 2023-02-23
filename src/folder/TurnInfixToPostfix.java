package folder;
/*
Sirve para convertir de Infix a Postfix
*/
import stack.StackVector;

public class TurnInfixToPostfix {
	private static TurnInfixToPostfix instance;
    private StackVector<Character> stack;

    private InfixToPostfixConverter() {
        this.stack = new StackVector<>();
    }

    
    /** 
     * 
     * @param c
     * @return int
     */
    private int precedence(char s) {
        switch (s) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    
    /** 
     * @param infixExpression
     * @return String
     */
    public String execute(String infix) {
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.empty() && precedence(c) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.empty()) {
            postfix += stack.pop();
        }

        return postfix;
    }

    
    /** 
     * @return InfixToPostfixConverter
     */
    public static TurnInfixToPostfix getInstance() {
        if (instance == null) {
            instance = new TurnInfixToPostfix();
        }

        return instance;
    }
}



