package org.example;

public class ProxyPerson implements Person {
    private RealPerson realPerson;
    private final int id;
    private final String name;

    public ProxyPerson(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void showPage() {
        if (realPerson == null){
            // впервые получаем данные о человеке
            realPerson = new RealPerson(id, name);
        }
        else{
            System.out.println("No need to fetch");
        }
        realPerson.showPage();
    }
}
