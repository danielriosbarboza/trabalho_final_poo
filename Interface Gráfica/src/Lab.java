public class Lab extends Produto {

    private String componentes;

    public String getComp() {
        return componentes;
    }

    public void setCompo(String componentes) {
        this.componentes = componentes;

    }

    @Override
    public String toString() {

        return "\n Produto: " + getProduto() + "\n Modelo: " + getModelo() + "\n Fabricante: "
                + getFabricante()
                + "\n Garantia: " + getGarantia() + " dias" + "\n Componentes: \n";
    }

}
