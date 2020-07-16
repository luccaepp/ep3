package ordenacao;

import particiona.Particiona;
import produto.Produto;


public class InsertionSort implements Ordenacao {
    public void ordenar(int ini, int fim, Produto[] produtos, Particiona particiona) {

        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];
            int j = (i - 1);

            while(j >= ini && j >=0){

                j = particiona.insertSort(x, produtos, j);
                break;

            }

            produtos[j + 1] = x;
        }

    }
}
