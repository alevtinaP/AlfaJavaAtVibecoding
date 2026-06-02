package pleer;

public class Winamp {
    static void main(String[] args) {
        //создаем объект плэйлиста
        Playlist myPlayList = new Playlist("Romantic Hits");

        System.out.println("1. Добавление песен в плейлист");
        myPlayList.addSong("Song 1");
        myPlayList.addSong("Song 2");
        myPlayList.addSong("Song 3");
        myPlayList.addSong("Song 4");
        myPlayList.addSong("Song 5");
        myPlayList.addSong("Song 6");

        System.out.println("\n 2. Удаление песни по индексу");
        myPlayList.deleteSong(1);

        System.out.println("\n 3. Обновление песни по индексу");
        myPlayList.updateSong(2, "Song 7");

        System.out.println("\n 4. Получение песни по индексу");
        myPlayList.getSong(1);


        System.out.println(myPlayList);

    }
}
