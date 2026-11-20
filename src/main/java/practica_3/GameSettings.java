package practica_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public void addPlayer() {
        this.currentPlayers += 1;
    }

    public void printGameStatus() {
        System.out.println("Название: " + this.gameName + " Текущее количество игроков: "
                + this.currentPlayers + " Максимальное количество игроков: " + maxPlayers);
    }
}
