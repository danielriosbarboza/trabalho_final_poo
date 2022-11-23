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

        return "Produto{" + "produto: /n" + getProduto() + ", modelo: " + getModelo() + ", fabricante: "
                + getFabricante()
                + ", garantia: " + getGarantia() + " dias" + ", componentes:";
    }

}
