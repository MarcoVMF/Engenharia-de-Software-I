public class Usuario {
    private String username;
    private String email;
    private String senha;
    private String fotoPerfil;
    private String biografia;

    public Usuario criar(String email, String senha, String username) {}
    public void adicionarComentario(String comentario) {}
    public void adicionarAvaliacao(float avaliacao) {}
    public void adicionarFavoritos(String nomeLivro) {}
    public void denunciarLivro(Livro livro, String conteudoDenuncia) {}
    public void escreverLivro(String conteudoLivro, Livro livro) {}
    public void publicarLivro(Livro livro) {}
    public void editarPerfil(String username, String biografia, String foto) {}
    public void alterarDadosPerfil(String username, String biografia, String foto) {}
    public void validarUsername(String username) {}
    public void validarBiografia(String biografia) {}
    public void validarFoto(String fotoPerfil) {}
    public void preencherFormularioSuporte(String ticket, String titulo, String explicacao){}
    public void finalizarSuporte(String ticket) {}
}
