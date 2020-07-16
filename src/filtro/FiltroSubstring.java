package filtro;

import produto.Produto;

public class FiltroSubstring implements Filtro {

    @Override
    public boolean filtrar(Object argFiltro, Produto p) {

        return p.getDescricao().contains((String)argFiltro);
    }
}
