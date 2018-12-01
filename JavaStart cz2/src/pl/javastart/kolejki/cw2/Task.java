package pl.javastart.kolejki.cw2;




/**
Napisz program, który będzie pozwalał stworzyć prostą listę To-Do (rzeczy do zrobienia) z możliwością określania priorytetów.
Do reprezentacji pojedynczych zadań utwórz klasę Task, w której będą pola name (nazwa zadania), description (opcjonalny opis zadania)
oraz priority (priorytet) w postaci wartości Enum przyjmującej wartość LOW, MODERATE lub HIGH.

W klasie TaskManager dodaj prostą logikę aplikacji, pozwalającą wykonać trzy czynności:
    -dodać nowe zadanie
    -pobrać kolejne zadanie o najwyższym priorytecie do zrobienia
    -wyjść z aplikacji
Kwestię obsługi wyjątków i nietypowych sytuacji możesz uprościć do minimum.
 */
class Task implements Comparable<Task> {
    private String name;
    private String description;
    private Priority priority;

    Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task o) {
        return priority.compareTo(o.priority);
    }
    protected enum Priority {
        HIGH(1), MODERATE(2), LOW(3);

        private int rank;

        Priority(int rank) {
            this.rank = rank;
        }
        public int getRank() {
            return rank;
        }
    }
    @Override
    public String toString() {
        return "Nazwa zadania: " + name + "\n" +
                "opis: " + description + "\n" +
                "priorytet: " + priority;
    }
}
