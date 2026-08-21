import java.util.Scanner;

public class Metodos {
    public ObjVehiculo[][] LlenarParqueadero(ObjVehiculo[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjVehiculo o = new ObjVehiculo();
                System.out.println("Ingrese la placa del vehiculo");
                o.setPlaca(sc.next());
                System.out.println("Ingrese el número de identificación del propietario");
                o.setCedula(sc.next());
                System.out.println("Ingrese el tipo de vehículo: 1) Carro o 2) Moto");
                o.setTipoVehiculo(sc.nextInt());
                System.out.println("Ingrese el tipo de plan: 1) Mensual, 2) Quincenal, 3) Trimestral");
                o.setPlan(sc.nextInt());
                System.out.println("Ingrese el valor del plan");
                o.setValorPlan(sc.nextDouble());
                System.out.println("Ingrese el descuento");
                o.setDescuento(sc.nextDouble());
                double totalPagar = (o.getValorPlan() - (o.getValorPlan() * o.getDescuento() / 100));
                o.setTotalPagar(totalPagar);
                m[i][j] = o;
            }

        }
        return m;
    }

    public void MostrarParqueadero(ObjVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Placa: " + m[i][j].getPlaca());
                System.out.println("Propietario: " + m[i][j].getCedula());
                System.out.println("Tipo de vehículo: " + m[i][j].getTipoVehiculo());
                System.out.println("Plan Contratado: " + m[i][j].getPlan());
                System.out.println("Valor del plan: " + m[i][j].getValorPlan());
                System.out.println("Descuento: " + m[i][j].getDescuento());
                System.out.println("Total a pagar: " + m[i][j].getTotalPagar());
            }
        }
    }

    public void MostrarPorTipo(ObjVehiculo[][] m, int tipo) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j].getTipoVehiculo() == tipo) {
                    System.out.println("Placa: " + m[i][j].getPlaca());
                    System.out.println("-------------------");
                }

            }
        }
    }

    public void MostrarPropietarios(ObjVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println(m[i][j].getCedula());
            }
        }
    }

    public void MostrarPlanes(ObjVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                String nombrePlan = "";
                if (m[i][j].getPlan() == 1) {
                    nombrePlan = "Mensual";
                } else if (m[i][j].getPlan() == 2) {
                    nombrePlan = "Quincenal";
                } else if (m[i][j].getPlan() == 3) {
                    nombrePlan = "Trimestral";
                }
                System.out.println("Placa: " + m[i][j].getPlaca() + " - Plan: " + nombrePlan);
            }
        }
    }

    public void MostrarTotalPorCliente(ObjVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println(
                        "Propietario: " + m[i][j].getCedula() + " - Total a pagar: " + m[i][j].getTotalPagar());
            }
        }
    }

    public double RecaudoTotal(ObjVehiculo[][] m) {
        double suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                suma += m[i][j].getTotalPagar();
            }
        }
        return suma;
    }

    public int ContarPorTipo(ObjVehiculo[][] m, int tipo) {
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j].getTipoVehiculo() == tipo) {
                    contador++;
                }
            }
        }
        return contador;
    }
}