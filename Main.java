public class Main {
    public static void main(String[] args) {
        // Criação das músicas
        Musica m1 = new Musica("Musica 1", "3:50");
        Musica m2 = new Musica("Musica 2", "4:05");
        Musica m3 = new Musica("Musica 3", "2:45");
        Musica m4 = new Musica("Musica 4", "3:30");
        Musica m5 = new Musica("Musica 5", "5:00");

        Musica[] musicasDoAlbum = {m1, m2, m3, m4, m5};

        Album album = new Album("Nome do Álbum", 2021, musicasDoAlbum);
    }
}
