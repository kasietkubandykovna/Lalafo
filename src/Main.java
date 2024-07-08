import enam.Role;
import models.Announcement;
import models.Favorite;
import models.User;
import myExceptionen.MyExceptionen;
import service.AnnouncementService;
import service.FavoriteService;
import service.serviceImpl.AnnouncementServiceImpl;
import service.serviceImpl.FavoriteServiceImpl;
import service.serviceImpl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws MyExceptionen {
        UserServiceImpl user =new UserServiceImpl();
        AnnouncementService announcement = new AnnouncementServiceImpl();
        FavoriteService favorite = new FavoriteServiceImpl();


        System.out.println("""
                1. save new user
                2. get all users
                3. get all user by id
                4. update user
                5. delete user
                6. save announcement
                7. get all announcements
                8. get all by id
                9. update announcement
                10. delete announcement
                11. save favorite
                12. get favorite by id
                13. get all favorite by user id
                14. delete favorite by id""");
        List<User> users = Arrays.asList(
                new User(1L,"Kasiet","Kasiet@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()),
        new User(2L,"Kurmanbek","Kurmanbek@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()),
        new User(3L,"Nurkyz","Nurkyz@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()),
        new User(4L,"Omurzak baike","Omurzak.baike@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>())
        );

        List<Announcement> announcements = Arrays.asList(
                new Announcement(1L, "iphone14", "sostayanie zynk baterii 93%", 60000, "Kasiet"),
                new Announcement(2L, "iphone12", "sostayanie zynk baterii 93%", 30000, "Kasiet"),
                new Announcement(3L, "iphone13", "sostayanie zynk baterii 93%", 45000, "Kasiet"));



        while (true) {
            Scanner sc = new Scanner(System.in);


            int number = sc.nextInt();
                switch (number) {
                    case 1-> {
                        for (User user1: users){
                            user.addUser(user1);
                        }
                    }
                    case 2-> System.out.println(user.getAllUsers());
                    case 3-> System.out.println(user.getUserById(1L));
                    case 4-> user.updateUser(2L,new User("Asyl","Asyl@gmail.com",12345, Role.USER,new ArrayList<>(),new ArrayList<>()));
                    case 5-> System.out.println(user.deleteUser(4L));
                    case 6-> System.out.println(announcement.addAnnouncement(1L,new Announcement(1L,"iphone14", "sostayanie zynk baterii 93%", 60000, "Kasiet")));
                    case 7-> System.out.println(announcement.getAllAnnouncement(1L));
                    case 8-> System.out.println(announcement.getAnnouncementById(2L));
                    case 9-> announcement.updateAnnouncement(2L,new Announcement("iphone15","new",13000,"Kasiet"));
                    case 10-> System.out.println(announcement.deleteAnnouncement(3L));
                    case 11-> System.out.println(favorite.addToFavorite(1L,2L,2L));
                    case 12-> System.out.println(favorite.getFavoriteByID(2L, 1L));
                    case 13-> System.out.println(favorite.getAllFavoriteByUserId(1L));
                    case 14-> System.out.println(favorite.deleteFavoritebyId(2L, 1L));
                }








    }
    }
}