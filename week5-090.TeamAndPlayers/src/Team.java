
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class Team {

    private String name;
    private int size = 16;

    private ArrayList<Player> player = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player person) {
        if (player.size() < size) {
            player.add(person);
        }
    }

    public void printPlayers() {

        for (Object i : player) {
            System.out.println(i);
        }
    }

    public void setMaxSize(int maxSize) {
        size = maxSize;
    }

    public int size() {
        return player.size();
    }

    public int goals() {
        int total = 0;
        for (Player p : player) {
            total += p.goals();
        }
        return total;

    }
}
