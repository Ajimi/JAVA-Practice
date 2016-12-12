import java.util.List;

/**
 * Created by selim on 12/11/2016.
 */
public class Responsable extends Personnel{
    public static final String CLASS_NAME = Responsable.class.getSimpleName(); // Class Name // Responable

    private Reserver reserver;
    private List<Material> materialDepartementElectrique;
    private List<Material> materialDepartementMecanique;
    private List<Material> materialDepartementInformatique;
    private List<Material> materialLocalMaterial;
    private List<Material> materialMaintenance;

    /*
        1 => Maintenance
        2 => Departement Informatique
        3 => Departement Mecanique
        4 => Departement Electrique
        5 => Local Materiel

     */

    public void mettreAJourMaterielMaintenance(){
        Material material;
        for (int i = 0; i < materialMaintenance.size(); i++) {
            material = materialMaintenance.get(i);
            if(!material.aReparer()){ // Material Jawou behy
                int place = material.getPlaceDelocal();
                switch (place){
                    case 1:
                        Maintenance.setMaterial();
                }
            }
        }
    }

    public void setMaterialMaintenance(){
        this.materialMaintenance = Maintenance.getMaterial();
    }

    public void deoptDeMaterialAMaintenance(Material material){
        materialMaintenance.add(material);
    }

    public void ajoutDeReservation(Information information){

    }

    public boolean confirmation(){
        return true;
    }



    public Responsable(String firstName, String secondName, String cin) {
        super(firstName, secondName, cin);
    }

    @Override
    void reserver(Information information) {
        super.reserver(information);
    }

    public Reserver getReserver() {
        return reserver;
    }

    public void setReserver(Reserver reserver) {
        this.reserver = reserver;
    }

}
