package filtro;

import produto.Produto;

public class FiltroEstoque implements Filtro {

    @Override
    public boolean filtrar(Object argFiltro, Produto p) {

        return (p.getQtdEstoque() <= (Integer) argFiltro);

    }
}
