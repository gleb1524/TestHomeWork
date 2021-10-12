package lesson5;

public class HomeWorkApp5 {
    public static void main(String[] args) {

        Employee employee = new Employee("Иванов Иван Иваныч", "Инженер",
                "iviviv@mail.ru", 8.9636534445, 30000, 45);

        Employee[] empl = new Employee[5];
        empl[0]=employee;
        empl[1]= new Employee("Пеетров Иван Петрович", "Инженер",
                "pet@mail.ru", 8.9635630045, 30000, 25);
        empl[2]= new Employee("Петрова Екатерина Ивановна", "Бухгалтер",
                "pet69@mail.ru", 8.666666666, 55000, 51);
        empl[3]= new Employee("Сидоров Сергей Савельевич", "Завхоз",
                "3s@mail.ru", 8.9632313115, 15000, 63);
        empl[4]= new Employee("Козлов Алексей Петрович", "Инженер",
                "kozal@mail.ru", 8.9333333333, 30000, 25);

        for (Employee person : empl){
            if(person.getAge()>40) person.infoEmployee();
        }

    }
}
