package filtro;

import produto.Produto;

public interface Filtro {

    boolean filtrar(Object argFiltro, Produto p);
}
