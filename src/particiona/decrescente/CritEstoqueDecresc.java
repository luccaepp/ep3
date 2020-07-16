package particiona.decrescente;

import particiona.Particiona;
import particiona.Result;
import produto.Produto;

public class CritEstoqueDecresc implements Particiona {


    @Override
    public int[] quickSort(int i, int j, Produto x, Produto[] produtos) {
        do{
            j--;

        } while(produtos[j].getQtdEstoque() < x.getQtdEstoque());

        do{
            i++;

        } while(produtos[i].getQtdEstoque() > x.getQtdEstoque());


        int[] nuns = new int[2];
        nuns[0] = i;
        nuns[1] = j;
        return nuns;
    }

    @Override
    public Result insertSort(Produto x, Produto[] produtos, int j) {
        boolean breakLoop = true;

        if(x.getQtdEstoque() > produtos[j].getQtdEstoque()){

            produtos[j + 1] = produtos[j];
            j--;
            breakLoop = false;
        }
        Result result = new Result(j, produtos, breakLoop);
        return result;
    }
}
