public class ThisKeyword5 {
    public static void main(String[] args) {
MusicAlbum album=new MusicAlbum("Ariana Grande", "sweetneer", 2019, false);
        System.out.println("album.artist = " + album.artist);
        System.out.println("album.album = " + album.album);
        System.out.println("album.yearRealise = " + album.yearRealise);
        System.out.println("album.isForKids = " + album.isForKids);
    }
    static class MusicAlbum{
       public String artist;
       public String album;
       int yearRealise;
       public boolean isForKids;


        public MusicAlbum(String artist, String album, int yearRealise, boolean isForKids){
            this.artist=artist;
            this.album=album;
            this.yearRealise=yearRealise;
            this.isForKids=isForKids;
        }
    }
}
