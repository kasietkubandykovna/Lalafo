import enam.Role;
import models.Announcement;
import models.User;
import service.AnnouncementService;
import service.serviceImpl.AnnouncementServiceImpl;
import service.serviceImpl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        UserServiceImpl user =new UserServiceImpl();
        user.addUser(new User(1L,"Kasiet","Kasiet@gmail.com",12345, Role.USER,new ArrayList<>()));
        AnnouncementService announcement =new AnnouncementServiceImpl();
        System.out.println(announcement.addAnnouncement(1L, new Announcement(1L, "iphone14", "sostayanie zynk baterii 93%", 60000, "Kasiet")));
        System.out.println(announcement.addAnnouncement(1L, new Announcement(2L, "iphone12", "sostayanie zynk baterii 93%", 30000, "Kasiet")));
        System.out.println(announcement.addAnnouncement(1L, new Announcement(3L, "iphone13", "sostayanie zynk baterii 93%", 45000, "Kasiet")));
        System.out.println(announcement.getAllAnnouncement(1L));
        System.out.println(announcement.getAnnouncementById(2L));
        announcement.updateAnnouncement(2L,new Announcement("iphone15","new",13000,"Kasiet"));
        System.out.println(announcement.getAnnouncementById(2L));
        System.out.println(announcement.deleteAnnouncement(3L));
        System.out.println(announcement.getAllAnnouncement(1L));

    }
}