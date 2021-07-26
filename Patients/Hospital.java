package Patients;

import java.util.ArrayList;
import java.util.List;

class Hospital {
private String hospitalName;
private ArrayList<Patients> patientsList = new ArrayList<>();

Hospital(String hospitalName){this.hospitalName = hospitalName;}

    void addPatientToPatientsList(Patients patient){
        patientsList.add(patient);
    }

    List<Patients> getListByDesiese(String desiese){
    List<Patients> list = new ArrayList<>();
        for (Patients c : patientsList) {
            if (c.getDesiese() == desiese) {
                list.add(c);
            }
        }

        return list;
}
    List<Patients> getListByDiapasonCardNumber(int diapazonStart, int diapazonEnd) {
        List<Patients> list = new ArrayList<>();
        for (Patients c : patientsList) {
            if (c.getCardNumber() >= diapazonStart && c.getCardNumber() <= diapazonEnd) {
                list.add(c);
            }
        }

        return list;
    }
}

