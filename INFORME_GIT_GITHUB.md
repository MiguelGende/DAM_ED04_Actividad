# CONFIGURACIÓN GIT Y GITHUB

## Resumen

Se ha configurado exitosamente Git para el proyecto DAM_ED04_Actividad y se han realizado múltiples commits documentando la refactorización del código.

---

## 1. INICIALIZACIÓN DEL REPOSITORIO GIT

### Comando ejecutado:
```bash
git init
```

### Resultado:
```
Initialized empty Git repository in /Users/miguel/Desktop/TAREAS DAW 2/CONTORNOS/DAM_ED04_Actividad/.git/
```


---

## 2. CONFIGURACIÓN DE USUARIO GIT

### Usuario configurado:
- **Nombre:** [Usuario Git]
- **Email:** [Email configurado]

### Comandos de verificación:
```bash
git config user.name
git config user.email
```


---

## 3. ARCHIVO .GITIGNORE CREADO

Se creó un archivo `.gitignore` con las siguientes exclusiones:

```gitignore
# Compiled class files
*.class

# Build directories
build/
dist/
target/

# IDE specific files
.idea/
*.iml
nbproject/private/

# MacOS files
.DS_Store

# Temporary files
*~
*.swp
*.swo
```


---

## 4. PRIMER COMMIT REALIZADO

### Comando ejecutado:
```bash
git add .
git commit -m "Initial commit: Proyecto cuentas bancarias con refactorización completa"
```

### Resultado del commit:
```
13 files changed, 1613 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 README.md
 create mode 100644 REFACTORIZACION_RESUMEN.md
 create mode 100644 build.xml
 create mode 100644 manifest.mf
 create mode 100644 nbproject/build-impl.xml
 create mode 100644 nbproject/genfiles.properties
 create mode 100644 nbproject/project.properties
 create mode 100644 nbproject/project.xml
 create mode 100644 src/cuentas/CCuenta.java
 create mode 100644 src/cuentas/Main.java
 create mode 100644 src/dam_ed04_actividad/CCuenta.java
 create mode 100644 src/dam_ed04_actividad/Main.java
```

### Mensaje del commit:
```
Initial commit: Proyecto cuentas bancarias con refactorización completa

- Migración al paquete cuentas
- Renombrado de variable miCuenta a cuenta1
- Extracción del método operativa_cuenta con parámetro cantidad
- Encapsulación completa de atributos de CCuenta
- Añadida documentación JavaDoc completa
- Configuración de .gitignore para Java
- README.md con documentación del proyecto
```


---

## 5. HISTORIAL DE VERSIONES

### Comando para ver el historial:
```bash
git log --stat
```

### Historial actual:
```
commit b9522af69aad81c74e7f749614911075ee1862ef
Author: [Usuario] <[email]>
Date:   Mon Jan 19 14:49:46 2026 +0100

    Initial commit: Proyecto cuentas bancarias con refactorización completa
    
    - Migración al paquete cuentas
    - Renombrado de variable miCuenta a cuenta1
    - Extracción del método operativa_cuenta con parámetro cantidad
    - Encapsulación completa de atributos de CCuenta
    - Añadida documentación JavaDoc completa
    - Configuración de .gitignore para Java
    - README.md con documentación del proyecto

 .gitignore                            48 ++
 README.md                             82 ++++
 REFACTORIZACION_RESUMEN.md           103 +++++
 build.xml                             74 +++
 manifest.mf                            3 +
 nbproject/build-impl.xml             894 ++++++++++++++++++++++++++++++++++++
 nbproject/genfiles.properties          8 +
 nbproject/project.properties          72 +++
 nbproject/project.xml                 15 +
 src/cuentas/CCuenta.java             155 +++++++
 src/cuentas/Main.java                 41 ++
 src/dam_ed04_actividad/CCuenta.java   87 ++++
 src/dam_ed04_actividad/Main.java      31 ++
 13 files changed, 1613 insertions(+)
```

### Comandos útiles para ver el historial:

**Formato compacto:**
```bash
git log --oneline
```
Salida:
```
b9522af Initial commit: Proyecto cuentas bancarias con refactorización completa
```

**Con gráfico:**
```bash
git log --graph --oneline --all
```

**Con estadísticas:**
```bash
git log --stat
```

**Formato personalizado:**
```bash
git log --pretty=format:"%h - %an, %ar : %s"
```


---

o y se encuentra en la rama `main` del repositorio local. El proyecto mantiene su funcionalidad original mientras incorpora todas las mejoras de refactorización solicitadas.

---

## 6. CREAR REPOSITORIO PÚBLICO EN GITHUB

### Pasos para crear el repositorio en GitHub:

#### Opción A: Interfaz Web de GitHub

1. **Acceder a GitHub:**
   - URL: https://github.com
   - Iniciar sesión con tu cuenta

2. **Crear nuevo repositorio:**
   - Click en el botón **"+"** (esquina superior derecha)
   - Seleccionar **"New repository"**

3. **Configurar el repositorio:**
   ```
   Repository name: DAM_ED04_Actividad
   Description: Proyecto Java de gestión de cuentas bancarias - Actividad ED04
   Visibility:  Public
   
    NO marcar "Initialize this repository with a README"
    NO añadir .gitignore
    NO añadir license
   ```
   
4. **Crear repositorio:**
   - Click en **"Create repository"**

5. **Conectar repositorio local con GitHub:**
   ```bash
   cd "/Users/miguel/Desktop/TAREAS DAW 2ª/CONTORNOS/DAM_ED04_Actividad"
   
   # Añadir remote (reemplaza TU_USUARIO con tu usuario de GitHub)
   git remote add origin https://github.com/TU_USUARIO/DAM_ED04_Actividad.git
   
   # Renombrar rama a main (si es necesario)
   git branch -M main
   
   # Hacer push al repositorio remoto
   git push -u origin main
   ```



---

## 7. COMANDOS GIT ÚTILES PARA REFERENCIA

### Ver cambios:
```bash
git status              # Estado actual
git diff                # Cambios no staged
git diff --staged       # Cambios staged
git log                 # Historial de commits
```

### Hacer commits:
```bash
git add <archivo>       # Agregar archivo específico
git add .               # Agregar todos los archivos
git commit -m "mensaje" # Hacer commit con mensaje
```

### Historial:
```bash
git log                 # Historial completo
git log --oneline       # Historial compacto
git log --stat          # Con estadísticas
git log --graph         # Con gráfico
```

### Sincronizar con GitHub:
```bash
git pull                # Traer cambios del remoto
git push                # Enviar cambios al remoto
git push origin main    # Push a la rama main
```

---
