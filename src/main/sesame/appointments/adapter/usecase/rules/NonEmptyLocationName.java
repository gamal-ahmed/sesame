package appointments.adapter.usecase.rules;

import appointments.adapter.domain.Appointment;

public class NonEmptyLocationName implements AppointmentPredicate<Appointment> {
    @Override
    public boolean test(Appointment appointment) {
        return !appointment.getLocation().getName().isEmpty();
    }
}
