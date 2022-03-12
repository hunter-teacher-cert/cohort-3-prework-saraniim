public class Beer {
public static void main(String[] args) {
    b(99);

}

public static void b(int n) { 
    if (n == 0){
        System.out.println();
        System.out.println("No bottles of beer on the wall,\n no bottles of beer,\n ya’ can’t take one down,\n ya’ can’t pass it around,\n ’cause there are no more bottles of beer on the wall!");
    } 
    else{
        System.out.println(n + " bottles of beer on the wall,\n" +  (n) + " bottles of beer,\n Ya' take one down, ya' pass it around,\n" + (n-1) + " bottles of beer on the wall");
        System.out.println();

        b(n - 1);

    }
} 
}