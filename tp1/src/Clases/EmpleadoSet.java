package Clases;

public class EmpleadoSet extends Empleado {

    public EmpleadoSet(String nombre, String apellido, Integer legajo, Integer aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        //Se fija si es una instancia de EmpleadoSet
        if (!(obj instanceof EmpleadoSet)) {
            return false;
        }
        EmpleadoSet otroEmpleado = (EmpleadoSet) obj;
        return this.getNombre().equals(otroEmpleado.getNombre())
                && this.getApellido().equals(otroEmpleado.getApellido())
                && this.getLegajo().equals(otroEmpleado.getLegajo())
                && this.getAniosTrabajados().equals(otroEmpleado.getAniosTrabajados());
    }


    // Se utiliza en el equals, tiene que devolver si o si un numero.
    @Override
    public int hashCode() {
        return this.getNombre().hashCode() +
                this.getApellido().hashCode() +
                this.getLegajo().hashCode() +
                this.getAniosTrabajados().hashCode();
    }
}
