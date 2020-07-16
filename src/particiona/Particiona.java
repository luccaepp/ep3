package particiona;

import produto.Produto;

public interface Particiona {

    int[] quickSort(int i, int j, Produto x, Produto[] produtos);

    Result insertSort(Produto x, Produto[] produtos, int j);
}
