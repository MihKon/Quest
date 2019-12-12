package com.company;

public class StoryThief {
    public Situation st_st;
    public Situation cur1_st;
    public Situation cur2_st;
    public Situation cur_sit;
    StoryThief(){
        st_st = new Situation("Пройти охрану",
                "Вот чёрт! Здесь охрана. Надо бы её обойти. Используем человека!"
                        +"Ты можешь позабавиться над смертным несколькими способами:\n" +
                        "1) Пробьёмся с боем!\n"
                        +"2) Пройдём по тихому...Обойдём замок, посмотрим, что там\n",
                2, 0, 0, 0);
        st_st.direction[0] = new Situation("Смогли!",
                "Повезло, что такой здоворяк у нас, за раз положили солдат!", 0, -5, -10, -20);
        st_st.direction[1] = new Situation("Заметили!",
                "Его доспехи звенят даже при обычной ходьбе! Сколько мы бегали от солдат? А они ещё и стреляли!", 0, -20, -40, -5);
        cur_sit = st_st;
        cur1_st = new Situation();
        cur1_st.direction[0] = new Situation();
        cur1_st.direction[1] = new Situation();
        cur_sit = cur_st;
        /*end_st = new Situation();
        end_st.direction[0] = new Situation();
        end_st.direction[1] = new Situation();
        cur_sit = end_st;*/
    }

    public void go(int num) {
        if (num<=cur_sit.direction.length)
            cur_sit = cur_sit.direction[num-1];
        else
            System.out.println("Ты можешь выбирать из"+cur_sit.direction.length+"вариантов");
    }

    public boolean isEnd(){
        return cur_sit.direction.length == 0;
    }
}
