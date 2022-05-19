package com.company;

public class Main {

    public static void main(String[] args) {
        Convert<String> fg;
        fg = (s)->System.out.println(new AnotherCalculation(s.a,s.b,s.c).calc());
        Calculation c = new Calculation(5,2,5);
        fg.conv(c);
    }
}
class Calculation{
    double a;
    double b;
    double c;
    Calculation(double a, double b, double c){
        this.a=a;
        this.b =b;
        this.c = c;
    }

    double calc(){
        return a*Math.pow(b,c);
    }
}
class AnotherCalculation{
    double a;
    double b;
    double c;
    AnotherCalculation(double a, double b, double c){
        this.a=a;
        this.b =b;
        this.c = c;
    }

    double calc(){
        return a*Math.pow(b,c);
    }
}
interface Convert<T>{
    void conv(Calculation s);
}