# 🎬 SENA Viewer: Plataforma de Streaming en Consola

Este proyecto simula una plataforma de streaming de contenido multimedia (películas, series, libros y revistas) implementada como una aplicación de consola en Java, utilizando los principios de la Programación Orientada a Objetos (POO), incluyendo Herencia e Interfaces.

---

## 👥 Integrantes y Roles

| Nombre | Rol |
| :--- | :--- |
| **[Juan David Barrios Urango]** | Desarrollador Principal, Diseñador POO |

---

## 🏗️ Estructura del Proyecto

El proyecto está organizado en paquetes lógicos para separar la lógica de negocio, la persistencia simulada y la interfaz de usuario.

## 🗺️ Etapa 1: Diseño de Clases Base y Herencia
El primer paso es implementar la estructura de clases requerida, enfocándonos en la Herencia para evitar la repetición de código y modelar correctamente la relación entre los tipos de contenido.

**📝 Tareas de la Etapa 1:**
Crear la clase Film (Clase Padre para Movie y Serie).

Crear la clase Publication (Clase Padre para Book y Magazine).

Crear y refactorizar las clases hijas: Movie, Serie, Book y Magazine.

Crear la clase Chapter (que no hereda de ninguna de las anteriores).

## ⏭️ Etapa 2: Interfaz y Gestión
El segundpo paso para el desarrollo de el proyecto es implementar la interfaz y gestion de datos, parta la visualización de los datos e interración del usuario

**📝 Tareas de la Etapa 2: Gestión de Datos e Interfaz**
La Etapa esta en la lógica de la aplicación y la interfaz de usuario:

Creación de una clase Main para la ejecución del programa y el menú principal.

Implementación de una clase MaterialManager para gestionar la lista de todos los contenidos.

Implementación de los métodos de visualización (marcar como visto/leído).
