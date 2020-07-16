package particiona;

import produto.Produto;

public class Result {

    private int j;
    private Produto[] produtos;
    private boolean breakLoop;

    public Result(int j, Produto[] produtos, boolean breakLoop) {
        this.j = j;
        this.produtos = produtos;
        this.breakLoop = breakLoop;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public boolean isBreakLoop() {
        return breakLoop;
    }

    public void setBreakLoop(boolean breakLoop) {
        this.breakLoop = breakLoop;
    }
}


