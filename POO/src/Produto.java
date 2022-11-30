public class Produto {

    private String produto;
    private String modelo;
    private int locationcomp = 0;
    private int quantidade;
    private String[] componentes = new String[100];

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto != null ? produto : "";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo != null ? modelo : "";
    }

    public int getLocationComp() {
        return locationcomp;
    }

    public void setLocationComp(int locationcomp) {
        this.locationcomp = locationcomp;

    }

    public int getQuantity() {
        return quantidade;
    }

    public void setQuantity(int quantidade) {
        this.quantidade = (quantidade > 0) ? quantidade : 2000;

    }

    public String getComp() {
        return "\n  Componente" + (locationcomp + 1) + ": " + componentes[locationcomp];
    }

    public void setComp(String componentes) {
        this.componentes[locationcomp] = componentes != null ? componentes : "";

    }

    @Override
    public String toString() {

        return "Produto = " + produto + "\nModelo = " + modelo + "\nComponentes:";
    }

}
