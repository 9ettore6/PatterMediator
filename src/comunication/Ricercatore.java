package comunication;

public class Ricercatore extends Docente {

    public Ricercatore(DialogDirector dd, String s, String ss) {
        super(dd, s, ss);
    }

    public void modifica(String scoperta) {
        System.out.println("Il " + this.getRuolo() + " " + this.getName() + " comunica: " + scoperta);

    }
}
