public abstract class Player {

    public Player(){}

    Player (String name){
        setName(name);
    }

    private String name = "Anon";

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
//        if (name != null && name.matches("^[a-zA-Z0-9~.]{5,}$")) {
//            this.name = name;
//            throw new NumberFormatException();
//        }
//        else {
//            System.err.println("Złe imie");
//            throw new IllegalArgumentException("Nieprawidłowe imię");
//        }
        this.name = name;
    }

    public abstract int guess();
}
