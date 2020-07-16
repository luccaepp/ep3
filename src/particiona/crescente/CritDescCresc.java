package particiona.crescente;

import particiona.Particiona;
import particiona.Result;
import produto.Produto;

public class CritDescCresc implements Particiona {

    @Override
    public int[] quickSort(int i, int j, Produto x, Produto[] produtos) {

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
    public Result insertSort(Produto x, Produto[] produtos, int j) {
        boolean breakLoop = true;
        if (x.getDescricao().compareToIgnoreCase(produtos[j].getDescricao()) < 0) {

            produtos[j + 1] = produtos[j];
            j--;
            breakLoop = false;
        }

        Result result = new Result(j, produtos, breakLoop);
        return result;
    }

}
