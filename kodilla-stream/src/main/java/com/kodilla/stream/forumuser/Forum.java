package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1,"Kamil Zawada", 'M',1, LocalDate.of(1993,4,4)));
        usersList.add(new ForumUser(2,"Kamil Zawadzki", 'M',112, LocalDate.of(1991,1,2)));
        usersList.add(new ForumUser(3,"Kamila Zawadzka", 'F',125, LocalDate.of(2013,2,3)));
        usersList.add(new ForumUser(4,"Dominika Kwiecień", 'F',132, LocalDate.of(2004,12,5)));
        usersList.add(new ForumUser(5,"John Locke", 'M',142, LocalDate.of(1978,4,6)));
        usersList.add(new ForumUser(6,"Lukas Wartalski", 'M',152, LocalDate.of(1986,6,12)));
        usersList.add(new ForumUser(7,"Laura Kowalska", 'F',112, LocalDate.of(1998,8,23)));
        usersList.add(new ForumUser(8,"Stanisław Tywoniuk", 'M',192, LocalDate.of(2000,3,30)));
    }

    public  List<ForumUser> getUsersList() {
        return  new ArrayList<>(usersList);
    }
}
