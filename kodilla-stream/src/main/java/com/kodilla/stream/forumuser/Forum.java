package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListForumUsers = new ArrayList<>();

    public Forum() {
        theListForumUsers.add(new ForumUser(1, "adamos", 'M', 1980, 2, 12, 20));
        theListForumUsers.add(new ForumUser(2, "tadeuszo", 'M', 1941, 3, 12, 10));
        theListForumUsers.add(new ForumUser(3, "komandos", 'M', 1999, 5, 30, 63));
        theListForumUsers.add(new ForumUser(4, "katarzynos", 'K', 1971, 7, 24, 44));
        theListForumUsers.add(new ForumUser(5, "kolezankos", 'K', 1977, 1, 2, 133));
        theListForumUsers.add(new ForumUser(6, "kolegos", 'M', 1985, 11, 10, 0));
        theListForumUsers.add(new ForumUser(7, "misiowa", 'K', 2001, 5, 23 , 210));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theListForumUsers);
    }
}
