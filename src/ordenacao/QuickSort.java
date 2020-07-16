package ordenacao;

import particiona.Particiona;
import produto.Produto;

public class QuickSort implements Ordenacao {
    @Override
    public void ordenar(int ini, int fim, Produto[] produtos, Particiona particiona) {

        if(ini < fim) {

            int q = particiona(ini, fim, produtos, particiona);

            ordenar(ini, q, produtos, particiona);
            ordenar(q + 1, fim, produtos, particiona);
        }

    }

    public int particiona(int ini, int fim, Produto[] produtos, Particiona particiona){

        Produto x = produtos[ini];

        int i = (ini - 1);
        int j = (fim + 1);

        while(true){

            int[] nuns = particiona.particionar(ini, fim, x, produtos);
            i = nuns[0];
            j = nuns[1];

            if(i < j){
                Produto temp = produtos[i];
                produtos[i] = produtos[j];
                produtos[j] = temp;
            }
            else return j;
        }
    }
}
