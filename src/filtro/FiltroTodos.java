package filtro;

import produto.Produto;

public class FiltroTodos implements Filtro {

    @Override
    public boolean filtrar(Object argFiltro, Produto p) {
        return true;
    }
}
