package sistemagestiondepersonal;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SistemaGestionDePersonal {


    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        BigDecimal base = new BigDecimal("235.000");
        BigDecimal adi = new BigDecimal("20.000");
        Administrativo emp1 = new Administrativo("Julio","Rodriguez",
                23465587, base, fecha, adi);

    }

}
