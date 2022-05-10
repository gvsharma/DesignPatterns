package creational.Builder;

import java.util.HashMap;
import java.util.Map;

public class Student {
    String fname;
    String lname;
    String email;
    String phone;
    String address;

    public Student() {

    }

    public Student(String fname, String lname, String email, String phone, String address) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Student(Map<String, String> map) {
        this.fname = map.get("fname");
        this.lname = map.get("lname");
        this.email = map.get("email");
        this.phone = map.get("phone");
        this.address = map.get("address");
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
