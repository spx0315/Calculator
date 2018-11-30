package rock.red;

public class Calculator {
    public String pattern;
    public double number[];
    public Calculator(String input) {
        String[] num = spiltNum(input);
        this.pattern = getPattern(input);
        for (int i = 0; i < num.length; i++) {
            this.number[i] = Double.parseDouble(num[i]);
        }
    }

    public String[] spiltNum(String input){

    }

    public String getPattern(String input) {
        return pattern;
    }

    public double[] getNumber() {
        return number;
    }
}
