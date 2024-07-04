package dao;

import models.Favorite;

import java.util.List;

public interface FavoriteDao {
    String addToFavorite(Long userId,Long announcementId);
    String deleteFavoritebyId(Long userId,Long favoriteId);
    Favorite getFavoriteByID(Long userId, Long favoriteId);
    List<Favorite> getAllFavoriteByUserId(Long userId);

}
