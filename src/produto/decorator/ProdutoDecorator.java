package produto.decorator;

import produto.ProdutoPadrao;

public abstract class ProdutoDecorator extends ProdutoPadrao {

    protected ProdutoPadrao produto;

    public ProdutoDecorator(int id, String descricao, String categoria, int qtdEstoque, double preco) {
        super(id, descricao, categoria, qtdEstoque, preco);
    }

}
