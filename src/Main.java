public class Main {
    public static void main(String[] args) {

        var biblioteka = new Biblioteka();
        var knyga = new Knyga("PavadinimasKnygos","Balys",1993);
        var knyga1 = new Knyga("PavadinimasKnygos1","Balysss",1993);
        var knyga2 = new Knyga("PavadinimasKnygos2","Balysss",1993);
        var knyga3 = new Knyga("PavadinimasKnygos3","Balysss",1993);
        var knyga4 = new Knyga("PavadinimasKnygos4","Balysss",1993);

        //biblioteka.idetiKnygaILentyna(knyga,23);
        //biblioteka.idetiKnygaILentyna(knyga1,122);
        //biblioteka.idetiKnygaILentyna(knyga2,12);
        //biblioteka.idetiKnygaILentyna(knyga2,12);
        //biblioteka.idetiKnygaILentyna(knyga4,12);

        //biblioteka.isimtiKnygaIsLentynos(knyga,23);
        //biblioteka.arKnygaYraBibliotekoje("PavadinimasKnygos2");

        var ivestis = new Ivestis();

        biblioteka.idetiKnygaILentyna(ivestis.pridetiKnyga());

        System.out.println(biblioteka);

        //System.out.println(knyga1);
    }
}

//Parašykite programą, kuri simbolizuotų biblioteką. Sukurkite klasę Knyga, kurioje yra šie atributai:
// pavadinimas, autorius, leidimo metai ir paskutinio skaitytojo ID (galite panaudoti int tipo kintamąjį).
// Nustatykite pavadinimo, autoriaus ir leidimo metų laukus kaip private,
// o skaitytojo ID lauką kaip private static. Sukurkite reikiamus getterius ir setterius.
//
//Taip pat, parašykite metodą grąžinimui knygos informacijos ekrane, kuris pateiktų visą knygos informaciją.


// Sukurkite klasę Biblioteka, kurioje yra sąrašas su knygomis. Sukurkite metodus,
// kurie leistų pridėti naujas knygas į biblioteką ir pasiimti knygą iš bibliotekos,
// priskirdami jai skaitytojo ID.

// Pagrindiniame kode sukurkite kad vartotojas galėtų įvesti naujas knygas
// į biblioteką ir pasiimti knygą pagal pavadinimą, atspausdindamas knygos informaciją.


// Taip pat įtraukite exception handling, kad vartotojas būtų informuotas, jei knyga nėra bibliotekoje
// arba jei nepavyksta tinkamai įvesti duomenų.