public class Suporte {
    private String conteudoSuporte;
    private String dataEnvio;
    private String ticket;

    public void emitirTicketDenuncia(Livro livro, String conteudoDenuncia) {}
    public void gerarTicketDenuncia(Livro livro, String conteudoDenuncia) {}
    public void chamadoSuporte(String ticket) {}
    public void iniciarContatoSuporte(String ticket) {}
    public void solicitarSuporte() {}
    public void emitirTicketSuporte() {}
    public void preencherDadosSobreSuporte(String ticket, String titulo, String explicacao) {}
    public void enviarFormularioSuporteFuncionario(Suporte suporte) {}
    public void encerrarSuporte(String ticket, int resultado) {}
}
