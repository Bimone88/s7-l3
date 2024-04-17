package simonemanca.s7.l3.esercizio3;

public class Main {
    public static void main(String[] args) {
        // Creazione degli ufficiali
        Ufficiale generale = new Generale("Generale in generale", 9000);
        Ufficiale colonnello = new Colonnello("Colonnello Swift", 1000);
        Ufficiale maggiore = new Maggiore("Maggiore Giuliano", 2000);
        Ufficiale capitano = new Capitano("Capitano Uncino", 3000);
        Ufficiale tenente = new Tenente("Tenente di Ploaghe", 4000);

        // Definizione delle responsabilità gerarchiche
        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);

        // Creazione di alcune richieste
        Richiesta richiesta1 = new Richiesta(300); // Importo della richiesta: $3500
        Richiesta richiesta2 = new Richiesta(4000); // Importo della richiesta: $10000

        // Gestione delle richieste
        tenente.gestisciRichiesta(richiesta1);
        System.out.println("--------");
        tenente.gestisciRichiesta(richiesta2);
    }
}
