package br.com.Vitor;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {

    protected ArrayList<Asset> assets = new ArrayList<Asset>();

    protected Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);

    private int pontos = 1;
    private int nivel = 1;

    public Tiro atirar() {

        Tiro tiro = nave.atirar(nivel);

        assets.add(tiro);
        return tiro;

    }

    public Meteoro criarMeteoro() {

        Random random = new Random();

        int x = random.nextInt(590);

        Meteoro meteoro = new Meteoro(x, 0, 5, Direcao.BAIXO);

        assets.add(meteoro);

        return meteoro;

    }

    public void pontuar() {
        
        pontos++;

        if (nivel > 4) {
            return;
        }


        if (pontos == 10) {
            nivel++;
            pontos = 0;
        }
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
