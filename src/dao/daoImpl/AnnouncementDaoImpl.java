package dao.daoImpl;
import dao.AnnouncementDao;
import datebase.DateBase;
import models.Announcement;

import java.util.List;

public class AnnouncementDaoImpl implements AnnouncementDao {

    @Override
    public String addAnnouncement(Long userId, Announcement announcement) {
        DateBase.users.stream().filter(user -> user.getId().equals(userId)).
                findFirst().filter(user -> user.getAnnouncements().add(announcement));
        return "success";
    }

    @Override
    public List<Announcement> getAllAnnouncement(Long userId) {
        return DateBase.users.stream().filter(user -> user.getId().equals(userId)).findFirst().get().getAnnouncements();
    }
        @Override
    public Announcement getAnnouncementById(Long id) {
        return DateBase.users.stream().
                flatMap(user -> user.getAnnouncements().stream())
                .filter(announcement -> announcement.getId().equals(id)).findFirst()
                .orElse(null);
    }

    @Override
    public void updateAnnouncement(Long id, Announcement newAnnouncement) {
            DateBase.users.stream().
                forEach(user -> user.getAnnouncements().stream()
                .filter(announcement -> announcement.getId().equals(id)).findFirst()
                   .ifPresent(announcement -> {
                       announcement.setName(newAnnouncement.getName());
                       announcement.setDescription(newAnnouncement.getDescription());
                       announcement.setPrice(newAnnouncement.getPrice());
                       announcement.setOwner(newAnnouncement.getOwner());
                   }));
    }

    @Override
    public String deleteAnnouncement(Long id) {
        DateBase.users.stream().forEach(user -> user.getAnnouncements().removeIf(announcement -> announcement.getId().equals(id)));
        return "success";
    }

public class AnnouncementDaoImpl {

}
