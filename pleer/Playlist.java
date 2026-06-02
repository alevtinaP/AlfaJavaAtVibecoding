package pleer;

import java.util.ArrayList;

public class Playlist {
    // поле - название плейлиста
    private String namePlayList;

    // поле - список песен
    private ArrayList<String> songs;

    // конструктор плейлиста
    public Playlist(String namePlayList) {
        this.namePlayList = namePlayList;
        this.songs = new ArrayList<>();
    }

    //геттер для названия плейлиста
    public String getNamePlayList() {
        return namePlayList;
    }

    //метод добавления песни
    public void addSong(String songName) {
        songs.add(songName);
        System.out.println("Добавлена песня \"" + songName + "\"");
    }

    //метод удаления песни
    public void deleteSong(int index) {
        if (index >= 0 && index < songs.size()) {
            String deletedSong = songs.remove(index);
            System.out.println("Удалена песня \"" + deletedSong + "\"");
        }
    }


    //метод одновления песни
    public void updateSong(int index, String newSongName) {
        if (index >= 0 && index < songs.size()) {
            String oldSong = songs.set(index, newSongName);
            System.out.println("Песня \"" + oldSong + "\"  заменена на   \"" + newSongName + "\"");
        }
    }

    //метод получения песни по индексу
    public String getSong(int index) {
        if (index >= 0 && index < songs.size()) {
            String song = songs.get(index);
            System.out.println("Получена песня \"" + song + "\"");
            return song;
        }
        return null;
    }

    @Override
    public String toString() {
        return "\n ПЛЭЙЛИСТ: " + namePlayList + " ВСЕГО ПЕСЕН - "  + songs.size() + " ПЕСНИ: " + songs;
    }


}

