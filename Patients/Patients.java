package Patients;

class Patients {
    {
        idGenerator++;
    }

    private  static int idGenerator = 0;
    private int id = idGenerator;// id,
    private String secondName;// Фамилия,
    private String firstName;// Имя,
    private String thirdName;// Отчество,
    private String adress;// Адрес,
    private int phone;// Телефон,
    private int cardNumber;// Номер мед карты,
    private String desiese;// Диагноз.

    public Patients(int id, String secondName, String firstName, String thirdName, String adress, int phone, int cardNumber, String desiese) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.thirdName = thirdName;
        this.adress = adress;
        this.phone = phone;
        this.cardNumber = cardNumber;
        this.desiese = desiese;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public int getId() {
        return id;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getDesiese() {
        return desiese;
    }

    @Override
    public String toString() {
        return "Patients.Patients{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", adress='" + adress + '\'' +
                ", phone=" + phone +
                ", cardNumber=" + cardNumber +
                ", desiese='" + desiese + '\'' +
                '}';
    }
}




