/**
 * @program: test
 * @description:
 * @author: Pin Chen
 * @create: 2022-04-12 11:10
 **/
public class Calcuator {
    public int compute(int num1, int num2, char symbol) {
        switch (symbol){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            default:
                throw new IllegalArgumentException();
        }
    }
}
