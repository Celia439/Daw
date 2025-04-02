package U3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class utilidadesFechas {
public static SimpleDateFormat CalcularEdad(String fechaNac) {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	Calendar cal = Calendar.getInstance();
	Date fechaAct = new Date();
	Date fechaActCal = cal.getTime();
	System.out.println(fechaAct);
	System.out.println(fechaActCal);
	//dia de la semana con date, tengo que usar simpledateformat
	SimpleDateFormat sdf0 = new SimpleDateFormat("EEEEEEEEE");
	System.out.println(sdf0.format(fechaAct));
	// dia de la semana con calendar
	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	System.out.println(cal.get(Calendar.MONTH));
	return sdf;
	// PRUEBAS CON EL TIPO Calendar
	
	
}
}
