package particiona;

import produto.Produto;

public interface Particiona {

    int[] particionar(int i, int j, Produto x, Produto[] produtos);

    int insertSort(Produto x, Produto[] produtos, int j);
}
