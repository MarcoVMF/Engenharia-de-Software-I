public class Livro {

    private String titulo;
    private String conteudo;
    private String dataPublicacao;
    private boolean revisaoOrtografica;
    private String genero;
    private int numPaginas;
    private String idioma;
    private float mediaAvaliacao;
    private String sinopse;

    public String buscarGenero(String palavraChave) {}
    public Livro buscarLivro(String palavraChave) {}
    public Usuario buscarAutor(String palavraChave) {}
    public String separarDetalhesLivro(Livro livro) {}
    public void vincularComentario(Comentario comentario) {}
    public void adicionarNota(float nota) {}
}
