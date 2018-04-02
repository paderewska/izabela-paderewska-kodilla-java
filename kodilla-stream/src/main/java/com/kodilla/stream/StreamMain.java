package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Calendar;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static int superMetoda(int doOdwrocenia) {

       int nowaliczba = 0;
       while(doOdwrocenia>0) {

           nowaliczba = nowaliczba*10 + doOdwrocenia%10;
           doOdwrocenia = doOdwrocenia / 10;
           }
        return nowaliczba;
    }

    public static void main(String[] args) {
        Forum forum = new Forum();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);


        Map<Integer, ForumUser> mapOfForum = forum.getUserList().stream()
           .filter(forumUser -> forumUser.getSex() == 'M')
           .filter(forumUser -> currentYear - forumUser.getDateOfBirth().getYear() >= 20)
           .filter(formUser -> formUser.getPostsNumber() >=1)
           .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("Liczba elementow w mapie: " + mapOfForum.size());
        mapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println(superMetoda(123456789));
    }
}
