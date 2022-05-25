package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "1234 № 123456";
        post.phone = "+7 (999)-999-99-99";
        post.birthday = new FormDate();
        post.birthday.day = 15;
        post.birthday.month = 05;
        post.birthday.year = 1965;
        post.subscription = true;
    }
}
