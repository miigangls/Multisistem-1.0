# Multisistem 1.0

Aplicación de escritorio tipo **mini-ERP** desarrollada en **Java (Swing)** para la gestión
integral de un negocio: facturación de compra y venta, inventario, bodega, proveedores,
empleados, nómina, contratación y recursos humanos.

Proyecto académico desarrollado entre **julio y agosto de 2013** con NetBeans + Apache Ant
y base de datos **Microsoft SQL Server**.

---

## ✨ Características

- **Facturación**: factura de compra, factura de venta y factura de servicios.
- **Inventario y bodega**: gestión de productos, existencias y control de bodega.
- **Compras**: proveedores, cotizaciones y solicitud de productos.
- **Recursos humanos**: aspirantes, empleados, contratación, contratos y servicios humanos.
- **Nómina**: cálculo y gestión de nómina de empleados.
- **Seguridad**: acceso mediante usuario y contraseña, con perfil de administrador.
- **Interfaz gráfica** moderna basada en el Look & Feel **Substance** (skin *Creme*).

---

## 🛠️ Tecnologías

| Componente        | Detalle                                             |
|-------------------|-----------------------------------------------------|
| Lenguaje          | Java (source/target **1.7**)                        |
| Interfaz          | Java Swing + [Substance](https://github.com/kirill-grouchnikov/radiance) L&F, SwingX, JCalendar, JGoodies |
| Base de datos     | Microsoft SQL Server (driver `sqljdbc` / `sqljdbc4`)|
| Construcción      | Apache Ant (proyecto NetBeans clásico)              |
| Pruebas           | JUnit 4                                             |

---

## 📁 Estructura del proyecto

```
Multisiste 1.0/
├── build.xml               # Script de construcción Ant
├── manifest.mf
├── nbproject/              # Configuración del proyecto NetBeans
└── src/
    ├── Program/            # Clase principal (Main)
    ├── Formularios/        # Ventanas / interfaces de usuario
    │   └── FromBuscar/     # Ventanas de búsqueda (producto, proveedor, aspirante)
    ├── Logica/             # Lógica base (CONEXION a la base de datos)
    ├── Negocios/           # Capa de negocio (métodos y variables globales)
    ├── Imagenes/           # Íconos de la aplicación
    ├── ImagenesMenu/       # Íconos del menú
    └── Imagene/Fondos/     # Imágenes de fondo
```

**Clase principal:** `Program.Main` — inicia con la ventana de inicio de sesión (`UsuarioContra`).

---

## 🚀 Cómo ejecutar

### Requisitos
- **JDK 7** o superior.
- **Microsoft SQL Server** con la base de datos `MULTISYSTEM_NACIONAL`.
- **Apache Ant** (o abrir el proyecto directamente en **NetBeans**).

### Opción A — NetBeans
1. Abrir el proyecto en NetBeans (*File → Open Project*).
2. Configurar la conexión a la base de datos (ver más abajo).
3. Ejecutar con **Run** (F6).

### Opción B — Línea de comandos (Ant)
```bash
ant clean
ant jar
java -jar dist/Multisistem_1.0.jar
```

---

## 🔌 Configuración de la base de datos

La conexión se define en `src/Logica/CONEXION.java`:

```java
Url      = "jdbc:sqlserver://SERVIDOR\\SQLEXPRESS;databaseName=MULTISYSTEM_NACIONAL";
Usuario  = "TU_USUARIO";
Contraseña = "TU_CONTRASEÑA";
```

Ajusta el **servidor**, **usuario** y **contraseña** según tu entorno de SQL Server.

> ⚠️ **Advertencia de seguridad:** en el código original las credenciales estaban escritas
> directamente en `CONEXION.java`. Se recomienda **cambiarlas** y, preferiblemente, moverlas
> a un archivo de configuración externo o variables de entorno antes de publicar o desplegar
> el proyecto. **Nunca subas credenciales reales a un repositorio público.**

---

## 📦 Módulos principales

| Módulo                | Archivos destacados                                            |
|-----------------------|---------------------------------------------------------------|
| Facturación           | `FacturaCompra`, `FacturaVenta`, `FacturaServicio`, `Cotisacione` |
| Inventario / Bodega   | `Invetario`, `SeccionBodega`, `Producto`, `SolicitarProducto` |
| Ventas                | `SeccionVentas`                                                |
| Proveedores           | `Proveedor`, `FromBuscar/BuscarProveedor`                     |
| Recursos Humanos      | `Aspirante`, `Empleado`, `Contrato`, `ServiciosHumanos`, `Administrador` |
| Nómina                | `nomina`                                                       |
| Seguridad             | `UsuarioContra`                                                |
| Conexión / Negocio    | `Logica/CONEXION`, `Negocios/*`                                |

---

## 📅 Historia del desarrollo

El repositorio conserva el historial de desarrollo original (julio–agosto 2013),
reconstruido a partir de las fechas de los archivos fuente.

---

## 👤 Autor

**Miguel Mendoza** — Proyecto académico (TGO ADSI — Análisis y Desarrollo de Sistemas de Información).

## 📄 Licencia

Proyecto con fines académicos y educativos.
