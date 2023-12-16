
public class Person {

    private int id;
    private String name;
    private String surname;
    private String phone;
    private String mail;
    private String password;
    private String gender;
    private String position;
    
    public Person(){
        
    }
    
    public Person(String name, String surname, String phone, String mail, String password, String gender, String position) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
        this.gender = gender;
        this.position = position;
    }

    public int getId(){
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

}
