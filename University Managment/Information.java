/**
 * Created by selim on 12/11/2016.
 */
public class Information{
    private String motif;
    private Material material;
    private Horaire heure;
    private Adherant adherant;

    public Information(String motif, Material material, Horaire heure, Adherant adherant) {
        this.motif = motif;
        this.material = material;
        this.heure = heure;
        this.adherant = adherant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Horaire getHeure() {
        return heure;
    }

    public void setHeure(Horaire heure) {
        this.heure = heure;
    }

    public Adherant getAdherant() {
        return adherant;
    }

    public void setAdherant(Adherant adherant) {
        this.adherant = adherant;
    }
}
