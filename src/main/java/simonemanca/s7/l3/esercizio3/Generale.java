package simonemanca.s7.l3.esercizio3;

public class Generale extends BaseUfficiale {
    public Generale(String nome, double stipendio) {
        super(nome, stipendio);
    }

    @Override
    public void gestisciRichiesta(Richiesta richiesta) {
        if (richiesta.getImporto() <= getStipendio()) {
            System.out.println(getNome() + " può gestire la richiesta di $" + richiesta.getImporto());
        } else {
            System.out.println("Richiesta non gestita.");
        }
    }
}
