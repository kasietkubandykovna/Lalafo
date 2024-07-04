package dao.daoImpl;

import dao.FavoriteDao;
import datebase.DateBase;
import models.Announcement;
import models.Favorite;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class FavoriteDaoImpl implements FavoriteDao {

DateBase dateBase=new DateBase();
Favorite favorite=new Favorite();
Announcement announcement=new Announcement();
User user=new User();

    @Override
    public String addToFavorite(Announcement announcement) {
        if (dateBase.announcements.contains(announcement)) {
            Favorite favorite = new Favorite( user,dateBase.announcements);
            dateBase.favorites.add(favorite);
            return "Announcement successfully added to favorites.";
        } else {
            return "Announcement not found.";
        }
    }
    @Override
    public String deleteFavoritebyId(Long id) {
        for (Favorite favorite1:dateBase.favorites){
            if (favorite1.getId().equals(id)){
                return "Annoncement successfully deleted from Favorite ";
            }else {
                return " Favorite not found";
            }

        }
        return null;
    }

    @Override
    public Announcement updateFavoriteById(Long id,Announcement announcement) {
       for (Announcement announcement1:dateBase.announcements){
           if (announcement1.getId().equals(id)){
               announcement1.setId(announcement.getId());
               announcement1.setName(announcement.getName());
               announcement1.setDescription(announcement.getDescription());
               announcement1.setPrice(announcement1.getPrice());
               announcement1.setOwner(announcement.getOwner());
               return announcement;
           }
           else {
               System.out.println(" Favorite not found");

           }       }

        return null;
    }

    @Override
    public Announcement getFavoriteByID(Long id) {
        for (Announcement announcement1:dateBase.announcements){
            if (announcement1.getId().equals(id)){
                return announcement1;
            }else{
                System.out.println(" Favorite not found");
            }
                    }

        return null;
    }

    @Override
    public List<Favorite> getAllFavoriteByUserId(Long userId) {
        List<Favorite> userFavorites = new ArrayList<>();
        for (Favorite favorite : dateBase.favorites) {
            if (favorite.getUser().getId().equals(userId)) {
                userFavorites.add(favorite);
            }
        }
        return userFavorites;
    }
}
