# Enunciado del Trabajo 21.

## Relaciones, herencia, clase y métodos abstractos

### Objetivo
Identificar, modelar e implementar en Java las clases involucradas en el enunciado especificando sus atributos, responsabilidades y relaciones entre las mismas.

### Consigna
- El Banco Nacional nos solicita modelar un nuevo sistema. Este sistema llevará el registro de las cuentas y de los clientes del banco.

- CLIENTES: Los clientes se identificarán con un número de cliente, un apellido, un DNI y un CUIT.

- CUENTAS: Permiten depositar, extraer efectivo e informar saldo. Una cuenta tiene un cliente asociado.

### EXTENSIÓN:

- Caja de ahorro: Poseen un saldo y además una tasa de interés. En este tipo de cuenta se pueden realizar tres operaciones:

- ○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.
- ○ Extraer efectivo: el cliente puede extraer dinero sin excederse de su saldo.
- ○ Cobrar interés: el cliente puede cobrar los intereses que su caja de ahorro le otorga mensualmente.

- Cuenta corriente: Poseen un saldo y, además, un monto autorizado para girar en descubierto. En este tipo de cuenta se pueden realizar dos operaciones:
○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.
○ Extraer efectivo: el cliente puede extraer dinero y utilizar su giro en descubierto en caso de que no tenga saldo suficiente.
