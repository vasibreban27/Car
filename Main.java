import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Autovehicul dacia = new Autovehicul();
        Autovehicul doi = new Autovehicul("BMW", Color.BLACK,0,0,300,7,new Sofer(),new Rezervor());
        Autovehicul trei = new Autovehicul("Ferrari",Color.RED,0,0,360,8,new Sofer(),new Rezervor());
        System.out.println(dacia.toString());
        System.out.println(doi.toString());
        System.out.println(trei);

        dacia.accelereaza();
        dacia.accelereaza();
        dacia.accelereaza();
        System.out.println(dacia);
        dacia.decelerare();
        System.out.println(dacia);
        dacia.oprire();
        System.out.println(dacia);
    }
}