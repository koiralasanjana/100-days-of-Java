//Write a program to print all the prime numbers between 1 and 100
public class Day6Prime1to100 {
    public void prime(){
        for(int num=2; num<=100; num++){
            boolean isPrime= true;
            for(int i=2; i<=Math.sqrt(num);i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }

            if (isPrime){
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args){
        Day6Prime1to100 prime = new Day6Prime1to100();
        prime.prime();
    }
}
