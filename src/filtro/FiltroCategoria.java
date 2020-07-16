package filtro;

import produto.Produto;

public class FiltroCategoria implements Filtro {
    @Override
    public boolean filtrar(Object argFiltro, Produto p) {
        return p.getCategoria().equalsIgnoreCase((String)argFiltro);
    }
}
