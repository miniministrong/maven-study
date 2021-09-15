package Study.Maven.Juint;

public class Factorial {
    public long fact(int num){
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}