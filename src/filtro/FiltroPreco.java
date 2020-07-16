package filtro;

import produto.Produto;

public class FiltroPreco implements Filtro {

    @Override
    public boolean filtrar(Object argFiltro, Produto p) {

        double [] intevalo = (double[]) argFiltro;

        return (p.getPreco() >= intevalo[0] && p.getPreco() <= intevalo[1]);
    }
}
