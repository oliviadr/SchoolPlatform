public class StaticDatabase
{
    public static Student[] studenti = new Student[] {
            new Student("Drobot","Olivia",212),
            new Student("Gavril","Raul",212),
            new Student("Lazlow","Szolt",212),
            new Student("Cinipa","Alexandru",212),
            new Student("Gamalie","Teodor",212),
            new Student("Dragomir","Eduard",212),
            new Student("Duruian","Laurentiu",212),
            new Student("Pirnuta","Denis",212),
            new Student("Nica","Ioana",212),
            new Student("Popa","Stefania",212),
            new Student("Georgescu","Alexandra",212),
            new Student("Mircea","Andrei",212),
            new Student("Simion","Razvan",212),
            new Student("Vorovenci","Gabriel",212),
            new Student("Szanto","Francisc",212),
            new Student("Gavrilescu","Sabina",212)
    };

    public static Profesor[] profesori = new Profesor[] {
            new Profesor("Dumitrescu","Maria"),
            new Profesor("Panaitescu","Anton"),
            new Profesor("Ivanovici","Matei"),
            new Profesor("Alexandrescu","Vasile"),
            new Profesor("Patru","George"),
            new Profesor("Banateanu","Mihai")
    };

    public static Curs[] cursuri = new Curs[] {
            new Curs("MIP","Programare Java",2,profesori[0]),
            new Curs("ME","Masuratori electrice si electronice",2,profesori[1]),
            new Curs("POO","Programare orientata pe obiecte , C++",1,profesori[0]),
            new Curs("AG","Algoritmica Grafurilor",1,profesori[2]),
            new Curs("Inteligenta Artificiala","Programare Python",3,profesori[5]),
            new Curs("Analiza Matematica","Calculul de integrale si derivate",3,profesori[3]),
            new Curs("Algad","Algad",1,profesori[1])
    };

}
