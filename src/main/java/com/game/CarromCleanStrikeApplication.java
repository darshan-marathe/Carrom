package com.game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CarromCleanStrikeApplication {
    public static void main(String[] args) {
        Striker striker = new Striker();
        Player p1 = new Player(1,0);
        Player p2 = new Player(2,0);
        List<Player> playerList =new ArrayList<Player>();
        playerList.add(p1);
        playerList.add(p2);
        CarromGame carromGame = new CarromGame(playerList,striker);
        for (int i = 1;i <= playerList.size();i++){
            Player player= playerList.get(i-1);
            int choice = printMsg(i);
            if (choice != 6){
                player.setNoneCount(0);
            }else {
                player.setNoneCount(player.getNoneCount()+1);
            }
            carromGame.getScore(player,choice);
            String result = carromGame.findFinalResult();
            if( result != null){
                System.out.println(result);
                break;
            }
            if (i == playerList.size()){
                i=0;
            }

        }

    }
    public static int printMsg(int p1){
        System.out.println("Player "+p1+" :Choose an outcome from the list below ");
        System.out.println("1. Strike ");
        System.out.println("2. Multistrike");
        System.out.println("3. Red strike");
        System.out.println("4. Striker strike");
        System.out.println("5. Defunct coin");
        System.out.println("6. None ");
        Scanner input = new Scanner(System.in);
        System.out.println(">");
        return input.nextInt();
    }
}
