package service.serviceImpl;

import dao.daoImpl.FavoriteDaoImpl;
import models.Announcement;
import models.Favorite;
import service.FavoriteService;

import java.util.List;

public class FavoriteServiceImpl implements FavoriteService {
    FavoriteDaoImpl favoriteDao=new FavoriteDaoImpl();


    @Override
    public String addToFavorite(Announcement announcement) {
        favoriteDao.addToFavorite(announcement);
        return null;
    }

    @Override
    public String deleteFavoritebyId(Long id) {
        favoriteDao.deleteFavoritebyId(id);
        return null;
    }

    @Override
    public Announcement updateFavoriteById(Long id, Announcement announcement) {
        favoriteDao.updateFavoriteById(id,announcement);
        return null;
    }

    @Override
    public Announcement getFavoriteByID(Long id) {
        favoriteDao.getFavoriteByID(id);
        return null;
    }

    @Override
    public List<Favorite> getAllFavoriteByUserId(Long userId) {
        favoriteDao.getAllFavoriteByUserId(userId);
        return null;
    }
}
