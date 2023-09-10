package org.example;

import java.util.Comparator;
public class TeacherComporator<T extends Teacher> implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}


//    @Override
//    public int compare(T o1, T o2) {
//        return o1.getExp() - o2.getExp();
//    }
//}

//public class UserComporator<T extends User> implements Comparator<T> {
//    @Override
//    public int compare(T o1, T o2) {
//        return o1.getScore() - o2.getScore();
