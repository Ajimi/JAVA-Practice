import java.util.List;

/**
 * Created by selim on 12/4/2016.
 */
public class Technicien extends Personnel {

    public static final String CLASS_NAME = Technicien.class.getSimpleName(); // Class Name

    private List<Maintenance> maintenance;

    public Technicien(String firstName, String secondName, String cin) {
        super(firstName, secondName, cin);
    }
    public void MettreAJour(int nombreDeMateriel){
        // Mettre a jour le material En utilisant le material reparer
        // Parcours liste de material
        // Consult the Material
        // Change the Material Etat
    }
    public boolean Consult(Material material){
        //  return material.Areparer()
        return false;
    }

    @Override
    void reserver(Information information) {

    }
}
