package comunication;

public class Principale {
    public static void main(String[] argv) {
        DialogDirector dialogDirector = new SistInfromativo();
        Docente responsabile = new ResponsabileP(dialogDirector, "Ettore", "responsabile");
        Docente ricercatore = new Ricercatore(dialogDirector, "Enrico", "ricercatore");
        Docente ricercatore1 = new Ricercatore(dialogDirector, "Mario", "ricercatore");
        responsabile.notifica("Nuovi fondi per tutti :-)");
        ricercatore1.notifica("Nessun progresso ;-(");
        ricercatore.notifica("Eureka!");

    }
}
