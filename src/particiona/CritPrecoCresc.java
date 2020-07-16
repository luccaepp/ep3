package particiona;

import particiona.Particiona;
import produto.Produto;

public class CritPrecoCresc implements Particiona {

    @Override
    public int[] particionar(int i, int j, Produto x, Produto[] produtos) {
        do{
            j--;

        } while(produtos[j].getPreco() > x.getPreco());

        do{
            i++;

        } while(produtos[i].getPreco() < x.getPreco());

        int[] nuns = new int[2];
        nuns[0] = i;
        nuns[1] = j;

        return nuns;    }

    @Override
    public int insertSort(Produto x, Produto[] produtos, int j) {
        if(x.getPreco() < produtos[j].getPreco()){

            produtos[j + 1] = produtos[j];
            j--;
        }
        return j;
    }
}
