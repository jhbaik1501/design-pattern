import game.Memento;
import game.Gamer;

import java.io.*;

public class Main {
    public static final String SAVEFILENAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);         // 최초 소지금은 100

        // 파일에서 읽어온다
        Memento memento = Memento.loadFromFile(SAVEFILENAME);
        if (memento == null) {
            System.out.println("새로 시작합니다.");
            memento = gamer.createMemento();  // 최초 상태를 저장해 둔다
        } else {
            System.out.println("이전에 저장한 결과부터 시작합니다.");
            gamer.restoreMemento(memento);
        }

        // 게임 시작 
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);         // 횟수 표시 
            System.out.println("상태:" + gamer);    // 현재 주인공의 상태 표시

            // 게임을 진행한다 
            gamer.bet();

            System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다.");

            // Memento 다루기로 결정 
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("※많이 늘었으니 현재 상태를 저장해 두자!");
                memento = gamer.createMemento();
                // 파일로 기록한다 
                if (Memento.saveToFile(SAVEFILENAME, memento)) {
                    System.out.println("현재 상태를 파일로 저장했습니다.");
                }
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("※많이 줄었으니 이전 상태를 복원하자!");
                gamer.restoreMemento(memento);
            }

            // 시간 대기 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
