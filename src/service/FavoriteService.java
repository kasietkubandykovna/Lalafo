package service;

import models.Announcement;
import models.Favorite;

import java.util.List;

public interface FavoriteService {
    String addToFavorite(Announcement announcement);
    String deleteFavoritebyId(Long id);
    Announcement updateFavoriteById(Long id, Announcement announcement);
    Announcement getFavoriteByID(Long id);
    List<Favorite>getAllFavoriteByUserId(Long userId);
}
