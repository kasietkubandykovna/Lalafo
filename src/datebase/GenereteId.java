package datebase;

public class GenereteId {
    public  static  Long userId = 0L;
    public  static  Long favoriteId = 0L;
    public static Long announcementId= 0L;

    public  static  Long genUserId(){
        return ++userId;
    }
    public  static  Long genFavoriteId(){
        return ++favoriteId;
    }
    public  static  Long genAnnouncementId(){
        return ++announcementId;
    }


}
