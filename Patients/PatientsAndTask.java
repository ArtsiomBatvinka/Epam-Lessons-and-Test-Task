package Patients;

import java.util.List;

public class PatientsAndTask {
    public static void main(String[] args) {
Hospital hospital = new Hospital("BSTU");
        hospital.addPatientToPatientsList(new Patients(1, "Иван", "Дроздов", "Михайлович", "Беларусь", 1232323,  11223344, "Acne"));
        hospital.addPatientToPatientsList(new Patients(2, "Андрей", "Фамильян", "Иванович",  "Беларусь", 3212323,  22334455, "Astma" ));
        hospital.addPatientToPatientsList(new Patients(3, "Богдан", "Мурахоедов", "Франкович",  "Беларусь", 2312323,  33445566, "PTSR" ));
        hospital.addPatientToPatientsList(new Patients(4, "Виктор", "Викторян", "Викторович",  "Беларусь", 4232323,  44556677, "Astma" ));
        hospital.addPatientToPatientsList(new Patients(5, "Франк", "Ибрагимов", "Ибрагимович",  "Беларусь", 5232323,  55667788, "PTSR" ));
        hospital.addPatientToPatientsList(new Patients(6, "Наташа", "Дроздова", "Алексеевна",  "Беларусь", 6232323,  66778899, "Acne" ));
        hospital.addPatientToPatientsList(new Patients(7, "Оксана", "Ростинова", "Ростиславовна",  "Беларусь", 7232323,  377889900, "Cancer" ));
        hospital.addPatientToPatientsList(new Patients(8, "Степан", "Боруков", "Алексеевич",  "Беларусь", 8232323,  88990011, "Acne" ));
        hospital.addPatientToPatientsList(new Patients(9, "Steeve", "Jackson", "<noname>",  "Беларусь", 1932323,  99001122, "Canser" ));
        hospital.addPatientToPatientsList(new Patients(10,"Александр", "Добрынин", "Станиславович",  "Беларусь", 4432324,  10122334, "PTSR" ));

        System.out.println("список пациентов, имеющих данный диагноз:");
List<Patients> listByDesiese = hospital.getListByDesiese("Acne");
for (Patients s : listByDesiese){
        System.out.println(s);
}
            System.out.println("\nсписок пациентов, номер медицинской карты которых находится в заданном интервале:");
            List<Patients> listSortByDiapazonCardNumber = hospital.getListByDiapasonCardNumber(22334455, 66778899);
            for (Patients s : listSortByDiapazonCardNumber) {
                    System.out.println(s);
            }

    }
}
