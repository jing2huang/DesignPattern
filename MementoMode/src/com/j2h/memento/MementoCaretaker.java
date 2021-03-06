package com.j2h.memento;

import java.util.ArrayList;

//管理者角色
public class MementoCaretaker {

	//定义一个集合来存储备忘录
    private ArrayList<ChessmanMemento> mementolist = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
