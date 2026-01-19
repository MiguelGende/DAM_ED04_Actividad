# DAM_ED04_Actividad - Proyecto Cuentas Bancarias

Proyecto Java para la gestión de cuentas bancarias con operaciones básicas de ingreso y retiro.

## Descripción

Este proyecto implementa un sistema simple de gestión de cuentas bancarias con las siguientes características:

- Creación de cuentas con titular, número de cuenta, saldo inicial y tipo de interés
- Operaciones de ingreso y retiro de fondos
- Validación de operaciones (montos negativos, saldo insuficiente)
- Encapsulación completa de atributos

## Estructura del Proyecto

```
DAM_ED04_Actividad/
├── src/
│   └── cuentas/
│       ├── CCuenta.java    # Clase que representa una cuenta bancaria
│       └── Main.java       # Clase principal con operaciones de ejemplo
├── build/
│   └── classes/            # Archivos compilados
├── .gitignore              # Archivos ignorados por Git
└── README.md               # Este archivo
```

## Compilación y Ejecución

### Compilar el proyecto:
```bash
javac -d build/classes src/cuentas/*.java
```

### Ejecutar el proyecto:
```bash
java -cp build/classes cuentas.Main
```

### Salida esperada:
```
El saldo actual es2500.0
Ingreso en cuenta
```

## Características Implementadas

### Clase CCuenta
- Atributos encapsulados (private)
- Constructores (por defecto y parametrizado)
- Métodos de acceso (getters/setters)
- Métodos de operación:
  - `estado()`: Consulta el saldo actual
  - `ingresar(double cantidad)`: Realiza un ingreso
  - `retirar(double cantidad)`: Realiza un retiro

### Clase Main
- Método `main`: Punto de entrada del programa
- Método `operativa_cuenta`: Encapsula las operaciones sobre una cuenta

## Refactorizaciones Aplicadas

1.  Migración al paquete `cuentas`
2.  Renombrado de variable `miCuenta` a `cuenta1`
3.  Extracción del método `operativa_cuenta`
4.  Encapsulación completa de atributos
5.  Parámetro `cantidad` añadido a `operativa_cuenta`

## Manejo de Excepciones

El proyecto utiliza excepciones para validar operaciones:
- No se pueden ingresar cantidades negativas
- No se pueden retirar cantidades negativas o cero
- No se puede retirar más dinero del saldo disponible

## Autor

Proyecto desarrollado como parte de la actividad DAM_ED04

## Versión

1.0.0 - Versión inicial con refactorización completa
