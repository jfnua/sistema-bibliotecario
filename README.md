## Tabla de contenido

- [Descricion](#info)
- [Requerimientos](#requerimientos)
- [Setup](#setup)

## Descricion
Sistema bibliotecario local para el manejo de libros y visitantes(miembros) de una biblioteca desarrollado con Java en Netbeans.
Proyecto final de la materia diseño de sistemas de segundo año de ingenieria en la Facultad de Informatica Mazatlán.

## Requerimientos
1. Netbeans con Java 8 (JDK1.8) de preferencia

2. Mysql

## Setup

### Para ejecutar el proyecto en Netbeans:

#### 1. Importamos y ejecutamos el script de la base de datos a Mysql, utilizando Mysql workbench, phpmyadmin u otro.
El script de sql se encuentra en la carpeta databse/ del proyecto.

#### 2. Importar el proyecto a Netbeans como ZIP.

![Image text](https://github.com/jfnua/sistema-bibliotecario/blob/main/imgreadme/importar-zip-netbeans.png)

#### 3. Cambiar el String de conexion a la base de datos en el archivo Conexion.java que esta en la carpeta src/BD/ del proyecto.

![Image text](https://github.com/jfnua/sistema-bibliotecario/blob/main/imgreadme/string-conexion-bd.png)

#### 4. Ejecutar el proyecto en Netbeans. En la ventana de login los datos son admin tanto el usuario como la contraseña.

![Image text](https://github.com/jfnua/sistema-bibliotecario/blob/main/imgreadme/ventana-login.png)

#### 5. Listo se mostrara la ventana principal de administracion del sistema bibliotecario

![Image text](https://github.com/jfnua/sistema-bibliotecario/blob/main/imgreadme/ventana-principal.png)
