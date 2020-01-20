package appointments.adapter.usecase.rules;

import appointments.adapter.domain.Appointment;

public class NonNegativePricePredicate implements AppointmentPredicate<Appointment> {
    @Override
    public boolean test(Appointment appointment) {
        return appointment.getService().getPrice() > 0;
    }
}
