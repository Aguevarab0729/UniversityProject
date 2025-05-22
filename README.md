# Sistema Universitario (Java)

Este proyecto es una aplicación de consola en Java para la gestión básica de una universidad: profesores, cursos y estudiantes.

## Estructura del proyecto

~~~
src/
├── Course.java
├── FullTimeTeacher.java
├── Main.java
├── Student.java
├── Teacher.java
├── University.java
~~~

### Descripción de archivos principales

Main.java:  Muestra el menú principal y gestiona la interacción con el usuario.

University.java: Contiene la lógica para manejar profesores, cursos y estudiantes.

Course.java: Representa un curso, con su nombre, profesor y lista de estudiantes.

Teacher.java: Clase abstracta para profesores.

FullTimeTeacher.java: Profesor de tiempo completo, hereda de Teacher.

Student.java: Representa a un estudiante.

(Otros archivos): Puedes agregar más clases según necesidades (por ejemplo, profesores de medio tiempo).

### Funcionalidades principales

* Listar profesores

* Listar cursos y ver detalles (profesor y estudiantes)

* Crear un estudiante y asignarlo a un curso


## Ejecución

  El menú permite:


1. Mostrar profesores.
2. Mostrar cursos y ver detalles.
3. Crear estudiante y asignarlo a un curso.
4. Salir.

>Nota: Al seleccionar cursos, ingresa el número mostrado en la lista, no el código del curso.
