package demo.uno.codigo;

import org.springframework.beans.factory.annotation.Value;

public class JugadorTenis implements Jugador {
	
	@Value("${correo}")
	private String correo;
	@Value("${titulo}")
	private String titulo;
	
	private RutinaService rutinaService;
	
	public JugadorTenis(RutinaService rutinaService) {
		this.rutinaService = rutinaService;
	}
	
	@Override
	public String ObtRutinaDiaria() {
		return rutinaService.rutinaDiaria();
	}

	public String getCorreo() {
		return correo;
	}

	public String getTitulo() {
		return titulo;
	}

}
