package creational.Builder;

public class NewStudent {
    String fname;
    String lname;
    String email;
    String phone;
    String address;

    public static class NewStudentBuilder {
        String fname;
        String lname;
        String email;
        String phone;
        String address;

        public NewStudent build() {
            NewStudent newStudent = new NewStudent();
            newStudent.fname = fname;
            newStudent.lname = lname;
            newStudent.email = email;
            newStudent.phone = phone;
            newStudent.address = address;
            return newStudent;
        }

        public String getFname() {
            return fname;
        }

        public NewStudentBuilder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        public String getLname() {
            return lname;
        }

        public NewStudentBuilder setLname(String lname) {
            this.lname = lname;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public NewStudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public NewStudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public NewStudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
