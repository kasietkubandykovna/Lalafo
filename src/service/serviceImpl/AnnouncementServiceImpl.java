package service.serviceImpl;

import dao.AnnouncementDao;
import dao.daoImpl.AnnouncementDaoImpl;
import models.Announcement;
import myExceptionen.MyExceptionen;
import service.AnnouncementService;

import java.util.List;

public class AnnouncementServiceImpl implements AnnouncementService {
AnnouncementDao announcementDao =new AnnouncementDaoImpl();
    @Override
    public String addAnnouncement(Long userId, Announcement announcement) {
        announcementDao.addAnnouncement(userId,announcement);
        return "success";
    }

    @Override
    public List<Announcement> getAllAnnouncement(Long userId) {
        return announcementDao.getAllAnnouncement(userId);
    }

    @Override
    public Announcement getAnnouncementById(Long id) throws MyExceptionen {
            return announcementDao.getAnnouncementById(id);
    }

    @Override
    public void updateAnnouncement(Long id, Announcement newAnnouncement) {
        announcementDao.updateAnnouncement(id,newAnnouncement);
    }

    @Override
    public String deleteAnnouncement(Long id) {
            announcementDao.deleteAnnouncement(id);
        return "success";
    }
}
