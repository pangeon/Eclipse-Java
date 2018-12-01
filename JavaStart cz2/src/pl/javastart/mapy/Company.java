package pl.javastart.mapy;

import java.util.HashMap;

class Company {
    private HashMap<String, Employee> workers;

    Company() {
        workers = new HashMap<>();
    }
    void addWorker(Employee worker) {
        String key = worker.getName() + " " + worker.getSurname();

        workers.get(key);
        workers.put(key, worker);
    }
    Employee getWorker(String name, String surname) {
        String key = name + " " + surname;
        return workers.get(key);
    }
}
