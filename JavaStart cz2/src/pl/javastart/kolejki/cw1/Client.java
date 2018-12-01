package pl.javastart.kolejki.cw1;



public class Client implements Comparable<Client> {
    private String nick;

    Client(String nick) {
        setNick(nick);
    }

    public String getNick() {
        return nick;
    }
    public int getNickLength() {
        return nick.length();
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public int compareTo(Client o) {
        if(o.getNick().length() > 7) {
            return 0;
        } else {
            return -1;
        }

    }


}
