package sistemagestiondepersonal;


import java.time.LocalDate;

public class SistemaGestionDePersonal {


    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        double base = 235000;
        double adi = 20000;
        Administrativo emp1 = new Administrativo("Julio","Rodriguez",
                23465587, base, fecha, adi);

    }

}
