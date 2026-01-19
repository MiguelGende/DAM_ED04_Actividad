# CONFIGURACIÓN GIT Y GITHUB - Documentación Completa

## 1. Configuración de Git Local - COMPLETADO

### Inicialización del repositorio
```bash
git init
```

**Resultado:** 
```
Initialized empty Git repository in /Users/miguel/Desktop/TAREAS DAW 2/CONTORNOS/DAM_ED04_Actividad/.git/
```

### Configuración de usuario Git
- **Usuario:** [Usuario configurado]
- **Email:** [Email configurado]

## 2. Primer Commit - COMPLETADO

### Archivos agregados al staging area
```bash
git add .
```

### Commit realizado
```bash
git commit -m "Initial commit: Proyecto cuentas bancarias con refactorización completa"
```

**Resultado del commit:**
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

**Estadísticas del commit:**
- **Total de archivos:** 13 archivos nuevos
- **Total de líneas:** 1,613 inserciones
- **Archivos principales:**
  - Código fuente Java refactorizado (paquete cuentas)
  - Código fuente original (paquete dam_ed04_actividad)
  - Documentación (README.md, REFACTORIZACION_RESUMEN.md)
  - Configuración del proyecto (.gitignore, build.xml, nbproject/)

**Contenido del commit:**
- Migración al paquete cuentas
- Renombrado de variable miCuenta a cuenta1
- Extracción del método operativa_cuenta con parámetro cantidad
- Encapsulación completa de atributos de CCuenta
- Añadida documentación JavaDoc completa
- Configuración de .gitignore para Java
- README.md con documentación del proyecto

## 3. Historial de Versiones - COMPLETADO

### Comando para mostrar el historial
```bash
git log --stat
```

### Historial actual del proyecto:

```
commit [hash completo]
Author: [Usuario] <[email]>
Date:   [fecha actual]

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

### Otros comandos útiles para ver el historial:

**Historial compacto:**
```bash
git log --oneline
```

**Historial con gráfico:**
```bash
git log --graph --oneline --all
```

**Historial detallado:**
```bash
git log --pretty=format:"%h - %an, %ar : %s"
```

## 4. Crear Repositorio Público en GitHub

### Opción A: Usando GitHub Web Interface (Recomendado)

1. **Ir a GitHub:** https://github.com
2. **Iniciar sesión** con tu cuenta
3. **Crear nuevo repositorio:**
   - Click en el botón "+" en la esquina superior derecha
   - Seleccionar "New repository"
   
4. **Configurar el repositorio:**
   - **Repository name:** `DAM_ED04_Actividad`
   - **Description:** "Proyecto Java de gestión de cuentas bancarias - Actividad ED04"
   - **Visibility:** Public
   - **NO** marcar "Initialize this repository with a README" (ya tenemos uno)
   - Click en "Create repository"

5. **Conectar el repositorio local con GitHub:**
   ```bash
   cd "/Users/miguel/Desktop/TAREAS DAW 2ª/CONTORNOS/DAM_ED04_Actividad"
   git remote add origin https://github.com/TU_USUARIO/DAM_ED04_Actividad.git
   git branch -M main
   git push -u origin main
   ```

### Opción B: Usando GitHub CLI (si está instalado)

```bash
# Instalar GitHub CLI primero (si no está instalado)
brew install gh

# Autenticarse
gh auth login

# Crear repositorio público
gh repo create DAM_ED04_Actividad --public --source=. --remote=origin --push
```

## Verificación Post-Push

Después de hacer push a GitHub, verificar:

```bash
# Ver el repositorio remoto configurado
git remote -v

# Ver el estado actual
git status

# Ver las ramas
git branch -a
```

## Comandos Git Útiles para el Futuro

### Ver cambios
```bash
git status              # Ver estado actual
git diff               # Ver cambios no staged
git diff --staged      # Ver cambios staged
```

### Hacer commits
```bash
git add <archivo>      # Agregar archivo específico
git add .              # Agregar todos los archivos
git commit -m "mensaje" # Hacer commit con mensaje
git commit -am "mensaje" # Add y commit en un paso
```

### Ver historial
```bash
git log                # Historial completo
git log --oneline      # Historial compacto
git log --stat         # Con estadísticas
git log -p             # Con diferencias
git log --graph        # Con gráfico
```

### Sincronizar con GitHub
```bash
git pull               # Traer cambios del remoto
git push               # Enviar cambios al remoto
git push origin main   # Push a la rama main
```

### Ramas
```bash
git branch             # Listar ramas
git branch nombre      # Crear rama
git checkout nombre    # Cambiar de rama
git merge nombre       # Fusionar rama
```


---

**Fecha:** 19 de Enero de 2026
**Proyecto:** DAM_ED04_Actividad
