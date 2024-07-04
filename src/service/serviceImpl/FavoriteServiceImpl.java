package service.serviceImpl;

import dao.FavoriteDao;
import dao.daoImpl.FavoriteDaoImpl;
import models.Favorite;
import service.FavoriteService;

import java.util.List;

public class FavoriteServiceImpl implements FavoriteService {
 FavoriteDao favoriteDao = new FavoriteDaoImpl();
    @Override
    public String addToFavorite(Long userId, Long announcementId,Favorite favorite) {
        favoriteDao.addToFavorite(userId, announcementId,favorite);
        return "";
    }

    @Override
    public String deleteFavoritebyId(Long userId, Long announcementId) {
        favoriteDao.deleteFavoritebyId(userId, announcementId);
        return "";
    }

    @Override
    public Favorite getFavoriteByID(Long userId, Long favoriteId) {

        return favoriteDao.getFavoriteByID(userId, favoriteId);
    }

    @Override
    public List<Favorite> getAllFavoriteByUserId(Long userId) {

        return favoriteDao.getAllFavoriteByUserId(userId);
    }
}
