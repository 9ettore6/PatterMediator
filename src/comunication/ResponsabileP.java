package comunication;

public class ResponsabileP extends Docente {

    public ResponsabileP(DialogDirector dd, String s, String ss) {
        super(dd, s, ss);
    }

    public void avvisa(String scoperta) {
        System.out.println("Il " + this.getRuolo() + " " + this.getName() + " comunica: " + scoperta);
    }

}
