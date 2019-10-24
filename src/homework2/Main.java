package homework2;

public class Main implements Inter {

    public static int a;
    public static int b;

    public void method1(){
        int i;
        System.out.println("a და b შორის არის:");
        if (a>b){
            int c = a;
            a=b;
            b=c;
        }
        for (i=a; i<=b; i++){

            System.out.println(i);
        }
    }
    public void method2(){
        int j;
        System.out.println("a-ს გამყოფებია:");
        for(j=1; j<=a; j++){
            if (a%j==0){

                System.out.println(j);
            }
        }

    }

    public void method3(){
        int d = 1;
        int i;
        int j;
        System.out.println("b-ს ყველა მარტივი გამყოფი:");

        for(i = 2; i <= b; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    d = 0;
                    break;
                }
                else
                {
                    d = 1;
                }
            }
            if(d == 1 && b%i==0)
            {
                System.out.println(i);
            }
        }

    }

    public void method4(){
        int []arr = new int[100];
        while(b > 0){

            int j = b % 10;
            b /= 10;
            arr[j] ++;

        }
        int freq = 0;
        int index = 0;
        for(int i = 0; i < 10; ++i){
            if(arr[i] > freq){
                freq = arr[i];
                index = i;
            }
        }
        System.out.println("b-ს ჩანაწერში ყველაზე ხშირად გამოყეებული რიცხვია:");
        System.out.println(index);
    }
    public static void main(String[] args) {
        a=9;
        b=30;

        Main m = new Main();
        m.method1();
        m.method2();
        m.method3();
        m.method4();
    }
}





