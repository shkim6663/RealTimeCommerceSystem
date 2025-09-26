public class Customer {
    private String name;
    private String email;
    private String grade;
    private String address;

    public Customer(String name, String email, String grade, String address) {
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "고객명: " + name + ", 이메일: " + email + ", 등급: " + grade + "주소 "+ address;
    }
}

