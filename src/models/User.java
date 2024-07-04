package models;

import enam.Role;

import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String email;
    private int password;
    private Role role;

    private List<Announcement>announcements;
   private List<Favorite> favorites;

    public User(Long id, String firstName, String email, int password, Role role, List<Announcement> announcements, List<Favorite> favorites) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.announcements = announcements;
        this.favorites = favorites;
    }

    public User(String firstName, String email, int password, Role role, List<Announcement> announcements, List<Favorite> favorites) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.announcements = announcements;
        this.favorites = favorites;
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

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", role=" + role +
                ", announcements=" + announcements +
                ", favorites=" + favorites +
                '}';
    }
}
