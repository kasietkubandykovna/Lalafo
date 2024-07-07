package service;

import models.Favorite;

import java.util.List;

public interface FavoriteService {
    String addToFavorite(Long vendorId, Long announcementId,Long userId);

    String deleteFavoritebyId(Long userId, Long announcementId);

    Favorite getFavoriteByID(Long userId,Long favoriteId);

    List<Favorite> getAllFavoriteByUserId(Long userId);
}
