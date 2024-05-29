package br.com.Vitor;

import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {

    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);

        Random random = new Random();

        int tamanho = random.nextInt(8) + 1;

        poder = tamanho;

        String path = "images/meteoro/meteoro" + poder + ".png";
        ImageView image = new ImageView(App.class.getResource(path).toString());

        setImagem(image);
    }

    public void tomarTiro(Tiro tiro) {

        poder -= tiro.getPoder();
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPoder() {
        return poder;
    }

}
