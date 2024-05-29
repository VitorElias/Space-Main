package br.com.Vitor;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);

    }

    public Tiro atirar(int poder) {

        Tiro atirar = new Tiro(getX(), getY(), 10, Direcao.CIMA, poder);

        return atirar;
    }

    @Override
    public void mover() {
        // Talvez errado

        super.mover();
        if (getX() < 0) {
            int x = 0;
            setX(x);
        }

        if (getX() > 640 - 50) {
            int x = 640 - 50;
            setX(x);
        }

    }

}
