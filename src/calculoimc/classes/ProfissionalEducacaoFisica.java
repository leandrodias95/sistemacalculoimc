package calculoimc.classes;

import calculoimc.interfaces.PermitirAcesso;

public class ProfissionalEducacaoFisica extends Pessoa implements PermitirAcesso {
	private String login;
	private String senha;
	private String cref; 
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}


	@Override
	public String toString() {
		return "ProfissionalEducacaoFisica [login=" + login + ", senha=" + senha + ", cref=" + cref + ", id=" + id
				+ ", nome=" + nome + ", nomeSocial=" + nomeSocial + ", idade=" + idade + ", cpf=" + cpf
				+ ", registroGeral=" + registroGeral + ", dataNascimento=" + dataNascimento + "]";
	}

	public boolean autenticar() {
		return login.equals("admin") && senha.equals("123");
		
	}

}
