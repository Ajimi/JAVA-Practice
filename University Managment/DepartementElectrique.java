import java.util.List;

/**
 * Created by selim on 12/11/2016.
 */
public  class DepartementElectrique extends Departement{
    public static final String CLASS_NAME = DepartementElectrique.class.getSimpleName(); // Nom de la class pour connaitre l'emplacement de material

    private static List<Material> mat;

    public static List<Material> getDepartementElectriqueMaterial() {
        return mat;
    }

    @Override
    public void placer(Material material) {

    }

    @Override
    public void setMaterial(List<Material> material) {

    }
}
