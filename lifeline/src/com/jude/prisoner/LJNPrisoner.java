package com.jude.prisoner;
import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by asus on 2015/11/5.
 */

public class LJNPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "龙俊男2015214051 ";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {

        return( ((totalCount-last-1)/(totalPerson-index))/2-1)/2-1;
    }

    @Override
    public void result(boolean survived) {

    }

}
