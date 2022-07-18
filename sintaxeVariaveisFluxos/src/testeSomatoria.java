public class testeSomatoria {
    public static void main(String[] args) {
        int contador = 0;
        long total=0;
        while(contador <=1000000000){
            
            total=total+contador;
            //System.out.println(total);
            contador++;

        }
        System.out.println(total);
    }
}
