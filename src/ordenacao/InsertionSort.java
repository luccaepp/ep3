package ordenacao;

import particiona.Particiona;
import particiona.Result;
import produto.Produto;


public class InsertionSort implements Ordenacao {
    public Produto[] ordenar(int ini, int fim, Produto[] produtos, Particiona particiona) {

        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];
            int j = (i - 1);

            while(j >= ini && j >=0){

                Result result = particiona.insertSort(x, produtos, j);
                if(result.isBreakLoop()) break;
                produtos = result.getProdutos();
                j = result.getJ();

            }

            produtos[j + 1] = x;
        }

        return produtos;
    }
}
