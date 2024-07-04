package models;

import enam.Role;

public class User {
    private String firstName;
    private String email;
    private int password;
private Role role;
private Long id;

    public User(Long id,String firstName, String email, int password, Role role) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", role=" + role +
                ", id=" + id +
                '}';
    }
}
