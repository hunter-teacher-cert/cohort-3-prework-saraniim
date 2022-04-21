public class Beer {
public static void main(String[] args) {
    b(99);

}

public static void b(int n) { 
    if (n == 0){
        System.out.println();
        System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down,\nya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!");
    } 
    else{
        System.out.println(n + " bottles of beer on the wall,\n" + (n) +" bottles of beer,\nYa' take one down, ya' pass it around,\n" + (n-1) +" bottles of beer on the wall");
        System.out.println();

        b(n - 1);

    }
} 
}