public class Storage extends Produto {

    private String[] storage = new String[1000];

    public String getStorage() {
        return storage[this.getLocationComp()];
    }

    public void setStorage(String storage) {
        this.storage[this.getLocationComp()] = storage;
    }

}