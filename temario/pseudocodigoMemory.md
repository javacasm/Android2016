# Desarrollo de aplicaciones Android (161811FP07)

	3x4 cartas
	6 parejas de imagenes

	* Incializar -> Inicialización
		Asignamos las posiciones de las  cartas
		Empezamos a contar tiempo
		Cargar sonidos
	* Tocamos 1ª carta  -> clickImagen
		Volteamos
		Guardamos nombre/id dibujo1
		Guardamos id boton
	* Tocamos 2ª carta  -> clickImagen
		Volteamos
		Guardamos nombre/id dibujo2
		Comparamos dibujo1 y dibujo2
			¿Iguales?
				Marcamos las posiciones como resueltas sin click
				Descontamos de las cartas pendientes
					¿Si no hay carta pendiente?
						Terminamos
						Mostramos tiempo
						Sonido aplausos!!!
						Mostrar mensaje
				Sonido BIEN!!!
			¿Distintas?
				Sonido Mal
				Volteamos ambas
	* Boton STOP -> botonStartStop
		Parar tiempo

	* Boton Start -> botonStartStop
		Mostrar cuadricula
		Encender tiempo

	* Boton Pausa
