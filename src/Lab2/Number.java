//WAP to create class Number with only one private instance variable as a double primitive type,
// Include the following methods isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ),
// isPrime(), isArmstrong() in this class
// All above methods should return boolean primitive type like for isPositive() should return “Positive = True”.

package Lab2;
public class Number {
    private double num;
    public Number(double num){
        this.num = num;
    }
    public boolean isZero(){
        return num == 0;
    }
    public boolean isPositive(){
        return num > 0;
    }
    public boolean isNegative(){
        return num < 0;
    }
    public boolean isOdd(){
        return num % 2 != 0;
    }
    public boolean isEven(){
        return num % 2 == 0;
    }
    public boolean isPrime(){
        if(num < 2){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong(){
        int sum = 0;
        double temp = num;
        while(temp != 0){
            double digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args){
        Number num = new Number(123);
        System.out.println("Number : "+num.num);
        System.out.println("isZero : "+num.isZero());
        System.out.println("isPositive : "+num.isPositive());
        System.out.println("isNegative : "+num.isNegative());
        System.out.println("isOdd : "+num.isOdd());
        System.out.println("isEven : "+num.isEven());
        System.out.println("isPrime : "+num.isPrime());
        System.out.println("isArmstrong : "+num.isArmstrong());
    }
}
