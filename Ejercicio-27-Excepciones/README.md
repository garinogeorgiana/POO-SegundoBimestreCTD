# Enunciado del Trabajo integrador N° 27.


### Objetivo

Aplicar los conocimientos de manejo de Excepciones, en un caso práctico.

### Ejercicio

En una clínica se tiene un sistema que registra los datos del paciente cuando es internado, estos datos son nombre, apellido, DNI, fecha de internación, también posee un fecha de alta que inicialmente está en null, posteriormente cuando es dado de alta, se cambia esa fecha con la fecha correspondiente. 
Para evitar posibles errores en la carga de datos debemos generar una Excepción personalizada que se genera cuando se crea el paciente, si la fecha de internación fuera posterior al día de hoy y cuando la fecha de alta es posterior al día de la internación.
Para facilitar el problema se provee el código correspondiente al paciente. Comprobar en una clase Main que las Excepciones creadas funcionan correctamente.

