public class Lab extends Produto {

    private int locationcomp;
    private String[] componentes = new String[100];
    private String[] storage = new String[100];

    public int getLocationComp() {
        return locationcomp;
    }

    public void setLocationComp(int locationcomp) {
        this.locationcomp = locationcomp;

    }

    public String getComp() {
        return componentes[locationcomp];
    }

    public void setComp(String componentes) {
        this.componentes[locationcomp] = componentes;

    }

    public String getStorage() {
        return storage[locationcomp];
    }

    public void setStorage(String storage) {
        this.storage[locationcomp] = storage;
    }

    @Override
    public String toString() {

        return "Produto: " + getProduto() + "\nModelo: " + getModelo() + "\nFabricante: "
                + getFabricante()
                + "\nGarantia: " + getGarantia() + " dias" + "\nComponentes: \n";
    }

}
