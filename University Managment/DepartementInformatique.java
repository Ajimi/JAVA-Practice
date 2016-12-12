import java.util.List;

/**
 * Created by selim on 12/12/2016.
 */
public class DepartementInformatique extends Departement {
    public static final String CLASS_NAME = DepartementInformatique.class.getSimpleName();

    private static List<Material> mat;
    public static List<Material> getDepartementInformatiqueMaterial() {
        return mat;
    }

    @Override
    public void placer(Material material) {

    }

    @Override
    public void setMaterial(List<Material> material) {

    }
}
