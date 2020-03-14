public class Main {

    public static void main(String[] args) {
	int x,y;
	x=42;
	y=15;
        System.out.println(~x);//11111111111111111111111111010101
        System.out.println(~y);//11111111111111111111111111110000
        System.out.println(x&y);//00001010
        System.out.println(x|y);//00101111
        System.out.println(x^y);//00100101
        System.out.println(x>>y);//0
        System.out.println(x>>>y);//0
        System.out.println(x<<y);//101010000000000000000
        System.out.println("");//


        x=-42;
        y=-15;
        System.out.println(~x);//00101001
        System.out.println(~y);//00001110
        System.out.println(x&y);//11111111111111111111111111010000
        System.out.println(x|y);//11111111111111111111111111110111
        System.out.println(x^y);//0100111
        System.out.println(x>>y);//11111111111111111111111111111111
        System.out.println(x>>>y);//111111111111111
        System.out.println(x<<y);//11111111101011000000000000000000
        
    }
}
