package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.setDay(15);
        post.birthday.setMonth(05);
        post.birthday.setYear(1965);
        post.setName("Иван");
        post.setPatronymic("Иванович");
        post.setSurname("Иванов");
        post.setPassport("1234 № 123456");
        post.setPhone("+7 (999)-999-99-99");
        post.setSubscription(true);
    }
}
