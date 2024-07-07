import enam.Role;
import models.Announcement;
import models.Favorite;
import models.User;
import service.AnnouncementService;
import service.serviceImpl.AnnouncementServiceImpl;
import service.serviceImpl.FavoriteServiceImpl;
import service.serviceImpl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {


        UserServiceImpl user =new UserServiceImpl();
        FavoriteServiceImpl favorite =new FavoriteServiceImpl();

        user.addUser(new User(1L,"Kasiet","Kasiet@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()));
        user.addUser(new User(2L,"Kurmanbek","Kurmanbek@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()));
        user.addUser(new User(3L,"Nurkyz","Nurkyz@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()));
        user.addUser(new User(4L,"Omurzak baike","Omurzak.baike@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()));

        System.out.println(user.getAllUsers());
//        user.updateUser(1L, new User("Asyl","Asyl@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()));
//        System.out.println(user.deleteUser(4L));

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

        System.out.println(favorite.addToFavorite(1L,2L,3L));
//        System.out.println(user.getAllUsers());
//        System.out.println(favorite.getAllFavoriteByUserId(3L));
        System.out.println(user.getUserById(3L));
        System.out.println(favorite.getFavoriteByID(3L, 1L));
        System.out.println(favorite.deleteFavoritebyId(3L, 1L));
        System.out.println(user.getUserById(3L));




    }
}