/**
 * Created by selim on 12/4/2016.
 */
public class Material {
    public static final String CLASS_NAME = Material.class.getSimpleName(); // Nom de la class pour connaitre l'emplacement de material

    private boolean etat;
    private boolean disponibilite;
    private int id;
    private String libelle;
    private int placeDelocal;
    private Local local;

    public boolean aReparer(){
        return !etat;
    }

    public void reparer(){
        this.etat = true;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPlaceDelocal() {
        return placeDelocal;
    }

    public void setPlaceDelocal(int placeDelocal) {
        this.placeDelocal = placeDelocal;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
