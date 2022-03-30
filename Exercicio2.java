public class Exercicio2 {
    public static void main(String[] args){
      int valores[] = {0, 1, 1, 2, 3, 5, 8};
            for(int i = 0;i < valores.length + 1;i++){
                int n1 = i - 1; 
                int n2 = i - 2; 
                int aux = n1 + n2;
                while(i < 21){
                    int aux = valores[i + 1] ;
                    System.out.println(valores[i]);
                }
            }
    }
}
