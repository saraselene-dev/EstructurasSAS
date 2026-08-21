Parqueadero - Estructuras S.A.S

Sistema de gestión de parqueadero desarrollado con matrices objetuales, como parte de la materia Estructura de Datos.

Descripción del problema

La empresa Estructuras S.A.S. administra un parqueadero para carros y motos, con planes de pago Mensual, Quincenal y Trimestral, 
cada uno con tarifa y descuento configurables por el usuario.

Estructura del proyecto

- ObjVehiculo.java: clase objeto con los atributos del vehículo (placa, cédula del propietario, tipo de vehículo, plan, valor del plan,
  descuento  y total a pagar).
- Metodos.java: clase con la lógica de negocio (llenar el parqueadero, mostrar información, filtrar por tipo de vehículo,
  mostrar propietarios, planes contratados, total por cliente y recaudo total).
- Principal.java: clase con el menú principal e interacción con el usuario.

Funcionalidades

1. Llenar parqueadero
2. Mostrar parqueadero completo
3. Mostrar carros registrados (con total de carros)
4. Mostrar motos registradas (con total de motos)
5. Mostrar propietarios
6. Mostrar planes contratados
7. Mostrar valor total por cliente
8. Mostrar recaudo total del parqueadero

Flujo de trabajo Git

Este proyecto sigue un flujo de ramas de tres niveles:
- Develop: rama de desarrollo activo.
- Test: rama de pruebas de calidad.
- Production: rama de producción final.

Cada funcionalidad se desarrolló en una rama independiente (ObjVehiculo, ClaseMetodos, Principal) y se integró a Develop mediante 
pull requests.

## Autor
Sara Selene Urrego Jiménez
