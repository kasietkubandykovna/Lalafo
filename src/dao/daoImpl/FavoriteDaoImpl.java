package dao.daoImpl;

import dao.FavoriteDao;
import datebase.DateBase;
import datebase.GenereteId;
import models.Announcement;
import models.Favorite;
import models.User;
import myExceptionen.MyExceptionen;

import java.util.List;

public class FavoriteDaoImpl implements FavoriteDao {
    GenereteId genFavoriteId=new GenereteId();

    @Override
    public String addToFavorite(Long vendorId, Long announcementId,Long userId)  {
        try {
        User vendor = DateBase.users.stream()
                .filter(user -> user.getId().equals(vendorId))
                .findFirst()
                .orElseThrow(() -> new MyExceptionen("Vendor with ID " + vendorId + " not found"));

        Announcement announcement = vendor.getAnnouncements().stream()
                .filter(a -> a.getId().equals(announcementId))
                .findFirst()
                .orElseThrow(() -> new MyExceptionen("Announcement with ID " + announcementId + " not found"));

        User user = DateBase.users.stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .orElseThrow(() -> new MyExceptionen("User with ID " + userId + " not found"));

        user.getFavorites().add(new Favorite(genFavoriteId.genFavoriteId(), vendor.getFirstName(), List.of(announcement)));
        return "success";
    } catch (MyExceptionen e) {
        System.err.println(e.getMessage());
        return "error: " + e.getMessage();
    }
}

    @Override
    public String deleteFavoritebyId(Long userId, Long favoriteId) {
        try {
            User user = DateBase.users.stream()
                    .filter(u -> u.getId().equals(userId))
                    .findFirst()
                    .orElseThrow(() -> new MyExceptionen("User with ID " + userId + " not found"));

            boolean removed = user.getFavorites().removeIf(favorite -> favorite.getId().equals(favoriteId));
            if (!removed) {
                throw new MyExceptionen("Favorite with ID " + favoriteId + " not found");
            }

            return "success";
        } catch (MyExceptionen e) {
            System.out.println(e.getMessage());
            return "error: " + e.getMessage();
        }
    }
    @Override
    public Favorite getFavoriteByID(Long userId, Long favoriteId) {
        try {
            for (User user : DateBase.users) {
                if (user.getId().equals(userId)) {
                    for (Favorite favorite : user.getFavorites()) {
                        if (favorite.getId().equals(favoriteId)) {
                            return favorite;
                        }
                    }
                }
            }
            throw new MyExceptionen("favorite with id " + favoriteId + " not found ");

        } catch (MyExceptionen e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

        @Override
    public List<Favorite> getAllFavoriteByUserId(Long userId)  {
            try {
                for (User user : DateBase.users) {
                    if (user.getId().equals(userId)) {
                        return user.getFavorites();
                    }
                }
                throw new MyExceptionen("User with id " + userId + " not found ");
            }catch (MyExceptionen e){
                System.out.println(e.getMessage());
            }
            return null;
        }}