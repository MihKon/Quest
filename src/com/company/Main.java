package com.company;

import java.util.Scanner;

public class Main {
    public static Knight gamer1;
    public static StoryKnight story1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        System.out.println("Хей! Да, да, ты. добро пожаловать в мир духов.\n"
                +"Ты попытался ограбить Дворец Царей и был закономерно убит. Ну бывает! Я тоже сюда так попал.\n"
                +"Эй, я слышал, что там помимо сокровищ, есть ещё и артефакты. Возможно мы сможем снова стать людьми, как думаешь?\n"
                +"Не хочешь попробывать? давай выберем человека, чтобы свершить задуманное. Вон есть врианты:\n"+
                "(выбери класс):");
        String ch = in.nextLine();
        if (ch.equalsIgnoreCase("knight")){
            System.out.println("Отлично! Хей, позабавимся? Он же теперь как зверь домашний\n"
                    +"Давай придумаем кличку ему:(введите имя)");
            gamer1 = new Knight(in.next());
            story1 = new StoryKnight();
            while (true) {
                gamer1.health += story1.cur_sit.dH;
                gamer1.endurance += story1.cur_sit.dE;
                gamer1.armor += story1.cur_sit.dA;
                System.out.println("======\tЗдоровье:" + gamer1.health + "\tВыносливость:"
                        + gamer1.endurance + "\tБроня:" + gamer1.armor + "\n======");
                System.out.println("=============" + story1.cur_sit.subject + "==============");
                System.out.println(story1.cur_sit.text);
                if (story1.isEnd()) {
                    System.out
                            .println("====================the end!===================");
                    return;
                }
                s = in.nextInt();
                story1.go(s);
                if (s==1){
                    story1 = new StoryKnight();
                }
            }
        }
    }
}
