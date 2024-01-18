package org.example;
import javax.persistence.*;
@Entity
@Table(name = "mycustomers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "myid")
    private int id;
    @Column(name = "myName") private String Name;
    @Column(name = "myEmail")private String Email;
    @Column(name = "myphone")private int phone;

    public Customer(int id, String name, String email, int phone) {
        this.id = id;
        Name = name;
        Email = email;
        this.phone = phone;
    }

    public Customer(String name, String email, int phone) {
        Name = name;
        Email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", phone=" + phone +
                '}';
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
