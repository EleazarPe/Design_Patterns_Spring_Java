package com.example.patronesdedisenosemana1;

import com.example.patronesdedisenosemana1.Builder.SandwichBuilder;
import com.example.patronesdedisenosemana1.Director.SandwichDirector;
import com.example.patronesdedisenosemana1.Entity.Sandwich;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronesDeDisenoSemana1Application {

	public static void main(String[] args) {

		// Originalmente creamos sandwich con el constructor completo

		Sandwich sandwich = new Sandwich(1, "integral", "danes", "pavo",
				"poco", "mucho", null, null, null);

		// Ahora podemos hacer el sandwich usando el builder

		SandwichBuilder builder1 = new SandwichBuilder();
		builder1.setId(1)
				.setTipoPan("integral")
				.setTipoQueso("danes")
				.setTipoCarne("pavo")
				.setCantLechuga("poco")
				.setCantTomate("mucho");

		// Sandwich sandwich1 = builder1.build();

		// Y si vamos a reutilizar este sandwich, es buena idea crear un director con nuestro templates de builder.
		// El director es opcional, pero nos puede ahorrar mucho codigo si utilizamos el mismo builder en varios lugares.

		SandwichDirector director = new SandwichDirector();
		SandwichBuilder builder = new SandwichBuilder();

		director.buildSandwich1(builder);

		Sandwich sandwich1 = builder.build();

		SpringApplication.run(PatronesDeDisenoSemana1Application.class, args);
	}

}
