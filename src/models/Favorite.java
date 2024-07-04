package models;

import java.util.List;

public class Favorite {
 private User user;
 private List<Announcement>announcements;

 public Favorite(User user, List<Announcement> announcements) {
  this.user = user;
  this.announcements = announcements;
 }

 public User getUser() {
  return user;
 }

 public void setUser(User user) {
  this.user = user;
 }

 public List<Announcement> getAnnouncements() {
  return announcements;
 }

 public void setAnnouncements(List<Announcement> announcements) {
  this.announcements = announcements;
 }

 @Override
 public String toString() {
  return "Favorite{" +
          "user=" + user +
          ", announcements=" + announcements +
          '}';
 }
}
