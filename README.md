# Aplicación JavaFX Menús

Esta aplicación de JavaFX demuestra la creación y el uso de una barra de menú con varios elementos de menú. La aplicación incluye una configuración básica con los menús "Archivo," "Editar," y "Ayuda."

## Requisitos
 - Java (JDK) 8 o posterior
 - SDK de JavaFX

## Características

**1. Menú Archivo:**
- **Nuevo:** Imprime "Nuevo" en la consola.
- **Abrir:** Imprime "Abrir" en la consola.
- **Guardar:** Imprime "Guardar" en la consola.
- **Salir:** Imprime "Salir" en la consola.

**2. Menú Editar:**
- **Copiar:** Imprime "Copiar" en la consola.
- **Pegar:** Imprime "Pegar" en la consola.

**3. Menú Ayuda:**
- Acerca de...: Imprime "Acerca de..." en la consola.

##  Explicación del Código
La clase principal **Menus** extiende **Application** y sobrescribe el método **start.** El método configura la ventana principal, la escena y el diseño, y crea una **MenuBar** con tres menús: **"Archivo," "Editar," y "Ayuda.**"

Cada menú contiene los objetos **MenuItem** relevantes, y se configuran manejadores de eventos para imprimir mensajes en la consola cuando se selecciona un elemento del menú.

## Ejecución
![Captura de pantalla 2024-06-09 102702](https://github.com/DiegoFeijoo55/SisMenusFeijoo/assets/169406880/6049348c-f00b-4ae3-a28c-4b6832be360b)
![Captura de pantalla 2024-06-09 102729](https://github.com/DiegoFeijoo55/SisMenusFeijoo/assets/169406880/c2c2cdd1-3cb1-4970-a3f0-d92c295355c5)
![Captura de pantalla 2024-06-09 102746](https://github.com/DiegoFeijoo55/SisMenusFeijoo/assets/169406880/6e3fdfd2-de5f-4bd7-9feb-602e4ecab1df)
