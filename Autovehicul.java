import java.awt.Color;
public class Autovehicul {
    private String marca;
    private Color culoare;
    private int vitezaCurenta;
    private int treaptaCurenta;
    private int vitezaMaxima;
    private static final int NR_TREPTE = 5;

    private Sofer sofer ;
    private Rezervor rezervor;

    public String getMarca()
    {
        return marca;
    }

    public Color getColor()
    {
        return culoare;
    }

    public int getViteza(){
        return vitezaCurenta;
    }
    public int getTreapta(){
        return treaptaCurenta;
    }

    public int getVitezaMaxima(){
        return vitezaMaxima;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setColor(Color color){
        this.culoare = color;
    }
    public void setViteza(int viteza){
        this.vitezaCurenta = viteza;
    }
    public void setTreapta(int treapta){
        this.treaptaCurenta = treapta;
    }
    public void setVitezaMaxima(int vitezaMaxima){
        this.vitezaMaxima = vitezaMaxima;
    }

    public Autovehicul(String marca,Color color,int viteza,int treapta,int vitezaMaxima,int nrTrepte,Sofer sofer,Rezervor rezervor)
    {
        this.marca = marca;
        this.culoare = color;
        this.vitezaCurenta = viteza;
        this.treaptaCurenta = treapta;
        this.vitezaMaxima = vitezaMaxima;
        this.sofer = sofer;
        this.rezervor = rezervor;
    }

    public Autovehicul()
    {
        this("Logan",Color.BLUE,0,0,200,6,new Sofer(),new Rezervor());
    }

    public String toString()
    {
        String s = "Autovehiculul " + this.marca + " cu culoarea " + this.culoare + " viteza curenta " + this.vitezaCurenta +
                " treapta curenta " + this.treaptaCurenta + " viteza maxima " + this.vitezaMaxima + " are numarul de trepte "+this.NR_TREPTE +
                " SOFER : " + this.sofer + " Rezervor : " + this.rezervor;
        return s;
    }

    public void accelereaza()
    {
        if(vitezaCurenta < vitezaMaxima)
             this.vitezaCurenta += 20;
        if(this.treaptaCurenta < NR_TREPTE)
            this.treaptaCurenta ++;
    }

    public void decelerare()
    {
        if(vitezaCurenta > 0)
            this.vitezaCurenta -= 20;
        if(this.treaptaCurenta > 0)
            this.treaptaCurenta --;
    }

    public void schimbaTreapta(int treapta)
    {
        if(treapta >= 0 && treapta<NR_TREPTE)
            treaptaCurenta = treapta;
        else
            treaptaCurenta = 0;
    }

    public void oprire()
    {
        while(this.vitezaCurenta > 0)
            decelerare();
    }

    public void setSofer(Sofer sofer)
    {
        this.sofer = sofer;
    }
    public Sofer getSofer()
    {
        return sofer;
    }
    public Rezervor getRezervor()
    {
        return rezervor;
    }
    public void setRezervor()
    {
        this.rezervor = rezervor;
    }

}
