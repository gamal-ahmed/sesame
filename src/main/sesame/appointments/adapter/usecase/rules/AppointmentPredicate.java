package appointments.adapter.usecase.rules;

import appointments.adapter.domain.Appointment;


public interface AppointmentPredicate<Appointment>  {

    boolean test(Appointment appointment);
}
