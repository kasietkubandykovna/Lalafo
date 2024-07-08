package service;

import models.Favorite;
import myExceptionen.MyExceptionen;

import java.util.List;

public interface FavoriteService {
    String addToFavorite(Long vendorId, Long announcementId,Long userId) throws MyExceptionen;

    String deleteFavoritebyId(Long userId, Long announcementId) throws MyExceptionen;

    Favorite getFavoriteByID(Long userId,Long favoriteId);

    List<Favorite> getAllFavoriteByUserId(Long userId) throws MyExceptionen;
}
