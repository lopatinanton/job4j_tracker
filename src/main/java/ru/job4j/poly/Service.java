package ru.job4j.poly;

public class Service {
    private Store store;

    public  Service(Store store) {
        this.store = store;
    }

    public void extract() {
        store.save("Anton Lopatin");
    }

    public static void main(String[] args) {
        DbStore store = new DbStore();
        Service service = new Service(store);
        service.extract();
    }
}
