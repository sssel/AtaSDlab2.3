public class FirstLvl {
    public long Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public long Function(int n,int m){
        return Factorial(n)/Factorial(n-m);
    }
}