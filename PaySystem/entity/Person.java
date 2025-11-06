package PaySystem.entity;

public class Person {
    private String name, surName, patronymic, numPhone;

    public Person(String name, String surName, String patronymic, String numPhone){
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.numPhone = numPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }
}
