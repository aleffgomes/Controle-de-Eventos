package mapa.mapa.eventos;

/**
 *
 * @author alefgomes
 */
public class Calculo {

    private int start;
    private int last;
    private double sum;
    private int count;
    private double media;
    private double mediaTotal;
    private char tipo;

    public Calculo(int start, int last, char tipo) {
        this.start = start;
        this.last = last;
        this.tipo = tipo;
    }

    public double getMedia() {
        media();
        return media;
    }

    public double getMediaTotal() {
        mediaTotal();
        return mediaTotal;
    }

    public double getSum() {
        setSoma();
        return sum;
    }

    public int getCount() {
        setContador();
        return count;
    }

    public void setContador() {
        while (this.start <= this.last) {
            if (tipo == 'p') {
                if (this.start % 2 == 0) {
                    this.count++;
                }
            } else if (tipo == 'i') {
                if (this.start % 2 != 0) {
                    this.count++;
                }
            } else {
                this.count++;
            }
            start++;
        }
        start = 1;
    }

    public void setSoma() {
        while (this.start <= this.last) {
            if (tipo == 'p') {
                if (this.start % 2 == 0) {
                    this.sum += this.start;
                }
            } else if (tipo == 'i') {
                if (this.start % 2 != 0) {
                    this.sum += this.start;
                }
            } else {
                this.sum += this.start;
            }
            start++;
        }
        start = 1;
    }

    public double media() {
        return this.media = this.sum / this.count;
    }

    public double mediaTotal() {
        return this.mediaTotal = this.sum / this.last;
    }

    public void print() {
        switch (tipo) {
            case 'p':
                System.out.println("Soma dos numeros pares: " + getSum());
                System.out.println("Quantidade de numeros pares: " + getCount());
                System.out.println("Média sob numeros pares: " + getMedia());
                System.out.println("Média sob todos os numeros: " + getMediaTotal());
                break;
            case 'i':
                System.out.println("Soma dos numeros impares: " + getSum());
                System.out.println("Quantidade de numeros impares: " + getCount());
                System.out.println("Média sob numeros impares: " + getMedia());
                System.out.println("Média sob todos os numeros: " + getMediaTotal());
                break;
            default:
                System.out.println("Soma dos numeros: " + getSum());
                System.out.println("Quantidade de numeros: " + getCount());
                System.out.println("Média sob todos os numeros: " + getMediaTotal());
                break;
        }
    }

}
