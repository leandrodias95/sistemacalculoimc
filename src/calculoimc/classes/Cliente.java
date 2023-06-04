package calculoimc.classes;

public class Cliente extends Pessoa {
	private float peso;
	private float altura;
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calculoImc() {
		return peso / (altura * altura);
	}

	public String tabelaImc() {
		if (calculoImc() >= 18.5) {
			if (calculoImc() >= 35 && calculoImc() <= 39.9) {
				return "Obsidade classe II";
			} else if (calculoImc() >= 30 && calculoImc() <= 34.9) {
				return "Obsidade classe I";
			} else if (calculoImc() >= 25 && calculoImc() <= 29.9) {
				return "Excesso de peso";
			}
			return "Peso normal";

		}
		return "Abaixo do peso normal";
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", nomeSocial="
				+ nomeSocial + ", idade=" + idade + ", cpf=" + cpf + ", registroGeral=" + registroGeral
				+ ", dataNascimento=" + dataNascimento + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
