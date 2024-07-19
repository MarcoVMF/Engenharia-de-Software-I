public class GerenciamentoDeContas {
    private Usuario usuarioCadastrados;

    public void validarDadosConta(Usuario usuario) {}

    public Usuario criarContaUsuario(String email, String senha, String username) {}

    public boolean validarSenha(String senha) {}

    public boolean validarEmail(String email) {}

    public boolean validarUsername(String username) {}

    public void adicionarUsuario(Usuario usuario) {}

    public void logarContaUsuario(String email, String username, String senha) {}

    public Usuario buscarUsuario(String email, String username, String senha) {}

    public boolean validarDadosLogar(String email, String username, String senha) {}

    public void autenticarUsuario(Usuario usuario) {}

    public void logoutContaUsuario(String email, String username, String senha) {}

    public void validarSessao(Usuario usuario) {}

    public boolean verificarSessaoValida(Usuario usuario) {}

    public void efetuarLogout(Usuario usuario) {}

    public void exibirMensagemErro(String tipoErro) {}

    public void redirecionarPagina(String tipoPagina) {}
}