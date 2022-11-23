public class Produto {

    private String produto;
    private String modelo;
    private String fabricante;
    private int garantia;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Produto{" + "produto: " + produto + ", modelo: " + modelo + ", fabricante: " + fabricante
                + ", garantia: " + garantia + " dias";
    }

}
