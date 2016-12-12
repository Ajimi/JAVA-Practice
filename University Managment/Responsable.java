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

    public Responsable(String firstName, String secondName, String cin) {
        super(firstName, secondName, cin);
        setMaterial();
    }

    /*
        1 => Maintenance
        2 => Departement Informatique
        3 => Departement Mecanique
        4 => Departement Electrique
        5 => Local Materiel

     */

    public void  emplacementMaterial(List<Material> material , String departement) {
        for(int i = 0 ; i < material.size() ; i++){
            if(material.get(i).aReparer()){
                materialMaintenance.add(material.get(i)); // Ajout dans le maintenance
                System.out.println("Il y'a un problem dans le materiel de la departement "+ departement);
                System.out.println("Le material est : "+ material.get(i).getLibelle());
                material.remove(i); // Suppression le données mel Local Existant
            }
        }
    }

    public void testMaterial (int place) {
        switch(place) {
            case 2:
                emplacementMaterial(materialDepartementInformatique , Departement.CLASS_NAME); // TODO(1): Create Classe informatique
                break;
            case 3:
                emplacementMaterial(materialDepartementMecanique , DepartementMecanique.CLASS_NAME);
                break;
            case 4:
                emplacementMaterial(materialDepartementElectrique , DepartementElectrique.CLASS_NAME);
                break;
            default:
                emplacementMaterial(materialLocalMaterial , LocalMaterial.CLASS_NAME);
                break;
        }
    }



    public void mettreAJourMaterielMaintenance(){
        Material material;
        for (int i = 0; i < materialMaintenance.size(); i++) {
            material = materialMaintenance.get(i);
            if(!material.aReparer()){ // Material Jawou behy
                int place = material.getPlaceDelocal();
                switch (place){
                    case 1:
                        depotMateriel(materialMaintenance , material);
                        break;
                    case 2:
                        depotMateriel(materialDepartementInformatique , material);
                        //Departement Informatique
                        break;
                    case 3:
                        // Departement Electrique
                        depotMateriel(materialDepartementElectrique , material);
                        break;
                    case 4:
                        // Deparement Electrique
                        depotMateriel(materialDepartementMecanique, material);
                        break;
                    default:
                        // Local Material
                        depotMateriel(materialLocalMaterial, material);
                        break;
                }
            }
        }
    }

    public void depotMateriel(List<Material> material, Material mat ){
        material.add(mat);
    }

    public void setMaterial(){
        setMaterialDepartementElectrique();;
        setMaterialDepartementMecanique();
        setMaterialDepartementInformatique();
        setMaterialLocalMaterial();
        setMaterialMaintenance();
    }

    public void setMaterialMaintenance(){
        this.materialMaintenance = Maintenance.getMaintenanceMaterial();
    }

    public void setMaterialDepartementElectrique() { this.materialDepartementElectrique = DepartementElectrique.getDepartementElectriqueMaterial();}

    public void setMaterialDepartementMecanique() {this.materialDepartementMecanique = DepartementMecanique.getDepartementMecaniqueMaterial();}

    public void setMaterialDepartementInformatique() {this.materialDepartementInformatique = DepartementInformatique.getDepartementInformatiqueMaterial();}

    public void setMaterialLocalMaterial() { this.materialLocalMaterial = LocalMaterial.getLocalMaterial() ;}



    public void ajoutDeReservation(Information information){

    }

    public boolean confirmation(){
        return true;
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
