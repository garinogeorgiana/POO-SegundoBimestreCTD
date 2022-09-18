# Enunciado del Trabajo 16.


### Ejercitación Herencia en Java
- La herencia es uno de los mecanismos más importantes de la programación orientada a objetos. Vamos a ver un ejemplo de un problema que utiliza este tipo de relación entre las clases.

### La clínica del doctor López
- En la clínica del doctor López hay muchos pacientes con diferentes patologías. Cada uno de ellos está internado y es atendido por un médico especialista.
- Cuando se registran, dejan los siguientes datos:
Número de documento
Nombre
Edad
Nombre de obra social  
particular (verdadero = sí)
Médico especialista que lo trata
Cantidad de estudios
Cirugía (verdadero si fue operado)
Alta (falso si está internado, verdadero si se curó)


- Los diferentes médicos tienen:
Número de matrícula 
Nombre
Los diferentes médicos especialistas son:
Cardiólogo
Cobra el importe básico de honorarios más el importe de cada estudio realizado.
Cirujano
Cobra el importe básico de honorarios más los honorarios de dos ayudantes
Dermatólogo.
Cobra el importe de honorarios más el importe básico de medicamentos.
Médico general
Cobra solo importe básico de honorarios

- Los pacientes se registran en la clínica y se le asigna un médico especialista. Por día se les pueden hacer estudios y se van registrando. Para saber cuánto debería pagar cada paciente, se debe tener en cuenta los honorarios de cada médico especialista y el importe fijo por cada cliente. En el caso de ser particulares deben pagar el total y si es de obra social, pagarán la mitad.
