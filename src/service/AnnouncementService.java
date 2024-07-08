package service;

import models.Announcement;
import myExceptionen.MyExceptionen;

import java.util.List;

public interface AnnouncementService {
    String addAnnouncement(Long userId, Announcement announcement);
    List<Announcement> getAllAnnouncement(Long userId);
    Announcement getAnnouncementById(Long id) throws MyExceptionen;
    void updateAnnouncement(Long id,Announcement newAnnouncement);
    String deleteAnnouncement(Long id);
}

