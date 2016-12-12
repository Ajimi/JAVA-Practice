import java.util.ArrayList;

public abstract class Adherant {
    private String firstName;
    private String secondName;
    private String cin;
    private ArrayList<Material> tabMaterial;

    public Adherant(String firstName, String secondName, String cin) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.cin = cin;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    abstract void reserver(Information info);

    public ArrayList<Material> getTabMaterial() {
        return tabMaterial;
    }

    public void setTabMaterial(ArrayList<Material> tabMaterial) {
        this.tabMaterial = tabMaterial;
    }
}
