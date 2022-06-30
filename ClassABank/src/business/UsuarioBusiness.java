package business;

public class UsuarioBusiness {
	Long usuarioId;
	String nome;
	String documento;
	Boolean ehPj;
	
	public UsuarioBusiness() {
		usuarioId = 0L;
		nome = "";
		documento = "";
		ehPj = false;
	}
	
	public void setNome(String nomeUser) {
		nome = nomeUser;
	}
	
	public void setDocumento(String documentoUser) {
		documento = documentoUser;
		if(documento.length() == 14) {
			ehPj = true;
		} else {
			ehPj = false;	
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public Long getUsuarioId() {
		return usuarioId;
	}
}
