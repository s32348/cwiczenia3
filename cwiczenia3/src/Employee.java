public class Employee {
    String firstname;
    String lastname;
    String city;
    String email;
    int pesel;
    int joindate;
    int salary;
    public Employee(String firstname, String lastname, String city, String email, int pesel, int joindate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.email = email;
        this.pesel = pesel;
        this.joindate = joindate;
        this.salary= salary;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPesel() {
        return pesel;
    }
    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
    public int getJoindate() {
        return joindate;
    }
    public void setJoindate(int joindate) {
        this.joindate = joindate;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
