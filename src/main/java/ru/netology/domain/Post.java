package ru.netology.domain;

public class Post {
//    private FormDate birthday;
    public FormDate birthday;
    private String name;
    private String patronymic;
    private String surname;
    private String passport;
    private String phone;
    private boolean subscription;

//    public void setBirthday(FormDate birthday) {
//        this.birthday.setDay();
//        this.birthday.setMonth();
//        this.birthday.setYear();
//    }

//        public void setBirthday() {
//            this.birthday.setDay(15);
//            this.birthday.setMonth(05);
//            this.birthday.setYear(1965);
//        }

    public void setName(String name) {
        this.name = name;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }
}
