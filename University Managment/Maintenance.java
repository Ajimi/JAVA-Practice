import java.util.List;

/**
 * Created by selim on 12/11/2016.
 */

public class Maintenance extends Local {
    public static final String CLASS_NAME = Local.class.getSimpleName(); // Nom de la class pour connaitre l'emplacement de material
    public static List<Material> mat;
    public static List<Material> getMaintenanceMaterial() {
        return mat;
    }
    @Override
    public void placer(Material material) {

    }

    @Override
    public void setMaterial(List<Material> material) {

    }
}
