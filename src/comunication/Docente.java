package comunication;

public class Docente {
    private String name;
    private String ruolo;
    private DialogDirector dd;

    protected Docente(DialogDirector dd, String s, String ss){
        this.dd = dd;
        name = s;
        ruolo = ss;
    }
    public void notifica(String scoperta){
        dd.comunica(this, scoperta);
    }

    public String getName() {
        return name;
    }

    public String getRuolo() {
        return ruolo;
    }
}
