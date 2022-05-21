package interfaces;

import exception.MyException;

public interface FightAble {

    void fight() throws MyException;
    void report() throws MyException;
}
