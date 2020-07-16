package produto.decorator;

import produto.Produto;

public class ProdutoDecoratorItalico extends ProdutoDecorator {

    public ProdutoDecoratorItalico(Produto p) {
        super(p.getId(), p.getDescricao(), p.getCategoria(), p.getQtdEstoque(), p.getPreco());
    }

    @Override
    public String formataParaImpressao() {
        return ("<span style=\"font-style:italic\">");
    }
}
