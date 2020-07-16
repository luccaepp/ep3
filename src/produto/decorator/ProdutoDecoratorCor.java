package produto.decorator;

import produto.Produto;

import java.awt.*;

public class ProdutoDecoratorCor extends ProdutoDecorator {

    private String color;

    public ProdutoDecoratorCor(Produto p, String color) {
        super(p.getId(), p.getDescricao(), p.getCategoria(), p.getQtdEstoque(), p.getPreco());
        this.color = color;

    }

    @Override
    public String formataParaImpressao() {
        return ("<span style=\"color:" + color +"\";>");
    }
}
