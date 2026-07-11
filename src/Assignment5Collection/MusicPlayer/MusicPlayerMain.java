package Assignment5Collection.MusicPlayer;

public class MusicPlayerMain {
    static void main(String[] args) {

        Playlist playlist = new Playlist();
        playlist.addSong("Love me like you do ");
        playlist.addSong("Criminal ");
        playlist.addSong("Mocking bird ");
        playlist.addSong("Slim shady");
        playlist.addSong("Love me like you do ");
        playlist.removeSong("broken angle ");
        System.out.println(playlist.contains("Paint the red"));
        playlist.display();
        System.out.println(playlist.size());

    }
}
