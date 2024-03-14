public class Album {
    private String nome;
    private int anoDeLancamento;
    private Musica[] musicas;

    public Album(String nome, int anoDeLancamento, Musica[] musicas) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.musicas = musicas;
    }
}