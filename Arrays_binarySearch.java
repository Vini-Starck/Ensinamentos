package ensinamentos;

// acha a posição do valor procurado

import java.util.Arrays;

public class Arrays_binarySearch {
    public static void main(String args[]){
        
        int vet[] = {2, 6, 7, 8, 4, 5, 9, 1, 3};
        
        int p = Arrays.binarySearch(vet, 8);
        System.out.println("posição do número: "+p);
        
    }
}
