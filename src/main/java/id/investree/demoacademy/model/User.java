package id.investree.demoacademy.model;

public class User {
    private long id;
    private String name;
    private int age;
    private Gender gender;
    private String address;

    public User() {
    }

    public User(long id, String name, int age, Gender gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender.toString();
    }

    public String getAddress() {
        return address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender.equals("male") ? Gender.MALE : Gender.FEMALE;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
