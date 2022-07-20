package agenda;

public class AgendaTeste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Killua Zoldyck", "killuaZoldick@gmail.com");
        Contato c2 = new Contato("Tsuna Sawada", "tsunasawada@gmail.com");
        Contato c3 = new Contato("Monkey D. Luffy", "monkeydluffy@gmail.com");
        Contato c4 = new Contato("Nico Robin", "nicorobin@gmail.com");

        agenda.addContato(c1);
        agenda.addContato(c2);
        agenda.addContato(c3);
        agenda.addContato(c4);

        System.out.println(agenda.listarContatos());
    }
}