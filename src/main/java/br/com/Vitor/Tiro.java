package br.com.Vitor;

import javafx.scene.image.ImageView;

public class Tiro extends Asset {

    private final int PODER;

    public Tiro(int x, int y, int velocidade, Direcao direcao, int poder) {
        super(x, y, velocidade, Direcao.CIMA);
        this.PODER = poder;

        String path = "images/laser/laser" + poder + ".png";
        ImageView image = new ImageView(App.class.getResource(path).toString());

        setImagem(image);
    }

    public int getPoder() {
        return PODER;
    }

}
