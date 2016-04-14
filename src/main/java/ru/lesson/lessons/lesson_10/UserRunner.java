package ru.lesson.lessons.lesson_10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergei.sasinovich on 14.04.2016.
 */
public class UserRunner {
    public static void main(String[] args) {
//        Set<User> users = new HashSet<User>();
//        users.add(new User("1", "first"));
//        users.add(new User("2", "two"));
//        users.add(new User("1", "first"));

        Map<String, User> users = new HashMap<String, User>();
        users.put("1", new User ("1", "first"));
        users.put("2", new User ("2", "two"));
        users.put("3", new User ("1", "first"));


        for (Map.Entry<String, User> user : users.entrySet()) {
            System.out.println(user);
        }
    }
}
