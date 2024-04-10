public class Knyga {
    private String pavadinimas, autorius;
    private int isleidimoMetai;
    private int paskutinioSkaitytojoID;
    private boolean arYraBibliotekoje;

    public Knyga(String pavadinimas, String autorius, int isleidimoMetai) {
        this.pavadinimas = pavadinimas;
        this.autorius = autorius;
        this.isleidimoMetai = isleidimoMetai;
        this.paskutinioSkaitytojoID = 0;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public boolean arYraBibliotekoje() {
        return arYraBibliotekoje;
    }

    public void pazymetiKaipIdeta() {
        this.arYraBibliotekoje = true;
    }

    public void pazymetiKaipIsimta() {
        this.arYraBibliotekoje = false;
    }

    public void setPaskutinioSkaitytojoID(int paskutinioSkaitytojoID) {
        this.paskutinioSkaitytojoID = paskutinioSkaitytojoID;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setAutorius(String autorius) {
        this.autorius = autorius;
    }

    public void setIsleidimoMetai(int isleidimoMetai) {
        this.isleidimoMetai = isleidimoMetai;
    }

    @Override
    public String toString() {
        return "Knyga{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", autorius='" + autorius + '\'' +
                ", isleidimoMetai=" + isleidimoMetai +
                ", paskutinioSkaitytojoID=" + paskutinioSkaitytojoID +
                ", arYraBibliotekoje=" + arYraBibliotekoje +
                '}';
    }
}
