import java.util.*;

public class Arrays {
    public static void main(String[]args){

try (Scanner sc = new Scanner(System.in)) {

    int size = sc.nextInt();

    String names [] = new String[size];

    // input name into the array
    for(int i = 0; i<size; i++)
    {
        names[i] = sc.next();
    }
    // output name from the array

    for(int i = 0; i<names.length; i++){
        System.out.println("name" + (i+1) +" is:" + names[i]);
    }
}
    }
}
                                  
