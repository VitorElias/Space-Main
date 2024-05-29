package br.com.Vitor;

import javafx.scene.image.ImageView;

public abstract class Asset {

    private int x;
    private int y;
    private ImageView imagem;
    private int velocidade = 10;
    private Direcao direcao;

    public Asset(int x, int y, int velocidade, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }

    public void mover() {

        if (direcao == Direcao.DIREITA) {
            x += velocidade;
        }
        if (direcao == Direcao.ESQUERDA) {
            x -= velocidade;
        }
        if (direcao == Direcao.CIMA) {
            y -= velocidade;
        }
        if (direcao == Direcao.BAIXO) {
            y += velocidade;
        }

    }

    public boolean colidiuCom(Asset asset) {
        return x < asset.getX() + 50 &&
                x + 50 > asset.getX() &&
                y < asset.getY() + 50 &&
                y + 50 > asset.getY();
    }

    // Gets e Sets

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

}
