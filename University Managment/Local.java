import java.util.List;

/**
 * Created by selim on 12/11/2016.
 */
public class  Local {
    public static final String CLASS_NAME = Local.class.getSimpleName(); // Nom de la class pour connaitre l'emplacement de material

    private List<Material> material;

    public List<Material> getMaterial() {
        return material;
    }

    public void placer(Material material){
        this.material.add(material);
    }



    public void setMaterial(List<Material> material) {
        this.material = material;
    }

    // Setter And getter Constructeur ..
}