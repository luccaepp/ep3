package ordenacao;

import particiona.Particiona;
import produto.Produto;

public interface Ordenacao {

    void ordenar(int ini, int fim, Produto[] produtos, Particiona particiona);

}
