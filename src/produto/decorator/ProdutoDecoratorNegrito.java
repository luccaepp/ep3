package produto.decorator;

import produto.Produto;

public class ProdutoDecoratorNegrito  extends ProdutoDecorator {

    public ProdutoDecoratorNegrito(Produto p) {
        super(p.getId(), p.getDescricao(), p.getCategoria(), p.getQtdEstoque(), p.getPreco());
    }

    @Override
    public String formataParaImpressao() {
        return ("<span style=\"font-weight:bold\">");
    }
}
