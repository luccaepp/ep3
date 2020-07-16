package particiona;

import particiona.Particiona;
import produto.Produto;

public class CritDescCresc implements Particiona {

    @Override
    public int[] particionar(int i, int j, Produto x, Produto[] produtos) {

        do{
            j--;

        } while(produtos[j].getDescricao().compareToIgnoreCase(x.getDescricao()) > 0);

        do{
            i++;

        } while(produtos[i].getDescricao().compareToIgnoreCase(x.getDescricao()) < 0);

        int[] nuns = new int[2];
        nuns[0] = i;
        nuns[1] = j;

        return nuns;
    }

    @Override
    public int insertSort(Produto x, Produto[] produtos, int j) {
        if (x.getDescricao().compareToIgnoreCase(produtos[j].getDescricao()) < 0) {

            produtos[j + 1] = produtos[j];
            j--;
        }

        return j;
    }

}
