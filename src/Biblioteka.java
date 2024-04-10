import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Knyga> knygosLentynoje;

    public Biblioteka() {
        knygosLentynoje = new ArrayList<>();
    }


    // Sutvarkyti!
    public void idetiKnygaILentyna(Knyga knyga, int skaitytojoID) {
        knyga.setPaskutinioSkaitytojoID(skaitytojoID);
        try {
            if (!knygosLentynoje.add(knyga)) {
                throw new Exception("Knygos jau yra lentynoje");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        knyga.pazymetiKaipIdeta();
    }

    public void idetiKnygaILentyna(Knyga knyga) {
        idetiKnygaILentyna(knyga,0);
    }

    public void isimtiKnygaIsLentynos(Knyga knyga, int skaitytojoID) {
        knyga.setPaskutinioSkaitytojoID(skaitytojoID);
        try {
            if (!knygosLentynoje.remove(knyga)) {
                throw new Exception("Knygos nera lentynoje");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        knyga.pazymetiKaipIsimta();

    }

    public void arKnygaYraBibliotekoje(String pavadinimas) {
        for (int i = 0; i < knygosLentynoje.size(); i++) {
            if (!knygosLentynoje.get(i).getPavadinimas().equals(pavadinimas)) {
                System.out.println("Knygos nera lentynoje");
            } else if(knygosLentynoje.get(i).getPavadinimas().equals(pavadinimas)) {
                System.out.println("Knyga jau yra lentynoje");
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                "knygosLentynoje=" + knygosLentynoje +
                '}';
    }
}




