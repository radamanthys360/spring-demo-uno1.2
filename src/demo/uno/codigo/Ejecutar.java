package demo.uno.codigo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecutar {

	//ejercicio 1 automatico
//	public static void main(String[] args) {
//		//leyendo configuracion de spring 
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		Jugador jugadorFutbol = context.getBean("jugadorFutbol", Jugador.class);
//		System.out.println(jugadorFutbol.ObtRutinaDiaria());
//		context.close();
//	}
	
	//ejercicio 2 manual
//	public static void main(String[] args) {
//		//leyendo configuracion de spring 
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		Jugador jugadorTenis = context.getBean("jugadorTenis", Jugador.class);
//		System.out.println(jugadorTenis.ObtRutinaDiaria());
//		context.close();
//	}
	
	
	//ejercicio 3 manual con propiedades
	public static void main(String[] args) {
		//leyendo configuracion de spring 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		JugadorTenis jugadorTenis = context.getBean("jugadorTenis", JugadorTenis.class);
		System.out.println(jugadorTenis.ObtRutinaDiaria());
		System.out.println(jugadorTenis.getCorreo());
		System.out.println(jugadorTenis.getTitulo());
		context.close();
	}

}
