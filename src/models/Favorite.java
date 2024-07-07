package models;

import java.util.List;

public class Favorite {
 private Long id;
 private String userName;
 private List<Announcement> announcements;

 public Favorite() {
 }

 public Favorite(String userName, List<Announcement> announcements) {
  this.userName = userName;
  this.announcements = announcements;
 }

 public Favorite(Long id, String userName, List<Announcement> announcements) {
  this.id = id;
  this.userName = userName;
  this.announcements = announcements;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getUserName() {
  return userName;
 }

 public void setUserName(String userName) {
  this.userName = userName;
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
          "id=" + id +
          ", userName='" + userName + '\'' +
          ", announcements=" + announcements +
          '}';
 }
}