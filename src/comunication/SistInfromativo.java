package comunication;

public class SistInfromativo extends DialogDirector {

    @Override
    public void comunica(Docente d, String scoperta) {
        if (d instanceof ResponsabileP)
            ((ResponsabileP) d).avvisa(scoperta);
        else if (d instanceof Ricercatore)
            ((Ricercatore) d).modifica(scoperta);
    }
}
