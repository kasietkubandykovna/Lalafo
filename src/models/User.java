package models;

import enam.Role;

import java.util.List;

public class User {
    private String firstName;
    private String email;
    private int password;
    private Role role;
    private Long id;
    private List<Announcement>announcements;

    public User(Long id,String firstName, String email, int password, Role role, List<Announcement> announcements) {

    private List<Favorite>favorites;

    public User(Long id,String firstName, String email, int password, Role role) {

        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.id=id;

        this.announcements = announcements;


    }

    public User() {
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

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;

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

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }
}
