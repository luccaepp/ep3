package ordenacao;

import particiona.Particiona;
import particiona.Result;
import produto.Produto;

public class QuickSort implements Ordenacao {

    protected Produto[] produtos;

    @Override
    public Produto[] ordenar(int ini, int fim, Produto[] produtos, Particiona particiona) {
        this.produtos = produtos;

        if(ini < fim) {

            Result result = particionador(ini, fim, particiona);
            int q = result.getJ();
            this.produtos = result.getProdutos();

            this.produtos = ordenar(ini, q, produtos, particiona);
            this.produtos = ordenar(q + 1, fim, produtos, particiona);
        }

        return produtos;
    }

    public Result particionador(int ini, int fim, Particiona particiona){

        Produto x = produtos[ini];

        int i = (ini - 1);
        int j = (fim + 1);

        while(true){

            int[] ij = particiona.quickSort(i, j, x, this.produtos);

            i = ij[0];
            j = ij[1];


            if(i < j){
                Produto temp = this.produtos[i];
                this.produtos[i] = this.produtos[j];
                this.produtos[j] = temp;
            }
            else return new Result(j,this.produtos, false);
        }
    }
}
