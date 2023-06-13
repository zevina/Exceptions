package finalWork;

public class Human {
    String surname;
    String name;
    String patronymic;
    String birthdate;
    String phonenumber;
    String gender;

    public Human() {
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//    public Human add()


    @Override
    public String toString() {
        return "<" + surname + ">" +
                "<" + name + ">" +
                "<" + patronymic + ">" +
                "<" + birthdate + ">" +
                "<" + phonenumber + ">" +
                "<" + gender + ">\n";
    }

}
