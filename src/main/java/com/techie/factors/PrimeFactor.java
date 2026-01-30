package com.techie.factors;

public class PrimeFactor {
    public static void main(String[] args) {
        int n=24;
        System.out.println(calculatePrimeFactor(n));
    }

    public static int calculatePrimeFactor(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){

            if(n%i==0) {
                if (i == n / i) {
                    return count++;
                }
                return count += 2;

            }
        }
        return -1;
    }
}
