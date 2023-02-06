package org.example;

public class RealPerson implements Person {
    private final int id;
    private final String name;

    public RealPerson(int id, String name){
        this.id = id;
        this.name = name;
        fetchFromDatabase(id);
    }

    private void fetchFromDatabase(int id) {
        // Магия с поиском по id в базе данных

        System.out.println("Fetching " + name);
    }

    @Override
    public void showPage() {
        System.out.println("Displaying " + name + "'s page\n");
    }
}
