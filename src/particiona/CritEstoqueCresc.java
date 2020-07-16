package particiona;

import particiona.Particiona;
import produto.Produto;

public class CritEstoqueCresc implements Particiona {


    @Override
    public int[] particionar(int i, int j, Produto x, Produto[] produtos) {
        do{
            j--;

        } while(produtos[j].getQtdEstoque() > x.getQtdEstoque());

        do{
            i++;

        } while(produtos[i].getQtdEstoque() < x.getQtdEstoque());


        int[] nuns = new int[2];
        nuns[0] = i;
        nuns[1] = j;
        return nuns;
    }

    @Override
    public int insertSort(Produto x, Produto[] produtos, int j) {
        if(x.getQtdEstoque() < produtos[j].getQtdEstoque()){

            produtos[j + 1] = produtos[j];
            j--;
        }
        return j;
    }
}
