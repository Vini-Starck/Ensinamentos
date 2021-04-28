package ensinamentos;

// ARRAYS: Coloca o vetor em ordem
// for (var (nome): (nome do vetor)) == cada repetição de for, a variavel (nome) recebe um valor do vetor


import java.util.Arrays;

public class Arrays_e_vetor_em_ordem {
    public static void main(String[] args) {
        int[]v = {9,5,3,7,1,6,4,8,2,-5,-8};
        Arrays.sort(v);
        for(int valor: v){
            System.out.println(valor);
        }
        System.out.println("============");
        int p = Arrays.binarySearch(v, 8);
        System.out.println("posição do número: "+p);
    }
}