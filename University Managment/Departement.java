import java.util.List;

/**
 * Created by selim on 12/11/2016.
 */
public abstract class Departement extends Local {
    public static final String CLASS_NAME = Departement.class.getSimpleName(); // Nom de la class pour connaitre l'emplacement de material

    @Override
    public void placer(Material material) {
        super.placer(material);
    }

    @Override
    public void setMaterial(List<Material> material) {
        super.setMaterial(material);
    }
}
