import java.util.LinkedList;
public class nomor1 {
    public static void main(String[] args) {

        //Isi karakter di variabel saya
        LinkedList <String> saya = new LinkedList<>();
        saya.add("N");
        saya.add("A");
        saya.add("D");
        saya.add("I");
        saya.add("L");
        saya.add("A");
        saya.add("");
        saya.add("R");
        saya.add("I");
        saya.add("Z");
        saya.add("K");
        saya.add("Y");
        saya.add("");
        saya.add("A");
        saya.add("M");
        saya.add("E");
        saya.add("L");
        saya.add("I");
        saya.add("A");
        System.out.println("\n");
        System.out.println("Diketahui SAYA \t: " + saya+", Ukuran : " +saya.size());
        System.out.println("\nSOAL NOMOR 1");
        
        //Memahami Konsep AddFirst dan AddLast
        saya.addFirst("");
        saya.addFirst("N");
        saya.addFirst("A");
        saya.addFirst("Y");
        saya.addFirst("A");
        saya.addFirst("W");
        saya.addFirst("");
        saya.addFirst("I");
        saya.addFirst("N");
        saya.addLast("");
        saya.addLast("N");
        saya.addLast("I");
        saya.addLast("H");
        System.out.println("ADD karakter lain yang Anda inginkan : "+saya+", Ukuran : " +saya.size());
    
        //Memahami Konsep Set (Tumpukan)
        saya.set(0,"N");
        saya.set(1,"I");
        saya.set(2,"");
        saya.set(3,"K");
        saya.set(4,"O");
        saya.set(5,"M");
        saya.set(6,"A");
        saya.set(7,"N");
        saya.set(8,"G");
        saya.set(9,"");
        saya.set(29,"A");
        saya.set(30,"J");
        saya.set(31,"A");
        System.out.println("\nSOAL NOMOR 2");
        System.out.println("SISIPKAN karakter lain yang Anda inginkan : "+saya+", Ukuran : " +saya.size());

        //Memahami Konsep Remove
        saya.remove(3);
        saya.remove(3);
        saya.remove(3);
        saya.remove(3);
        saya.remove(3);
        saya.remove(3);
        saya.remove(3);
        saya.remove(3);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        saya.remove(8);
        System.out.println("\nSOAL NOMOR 3");
        System.out.println("HAPUS beberapa karaker yang ingin Anda hapus : "+saya+", Ukuran : " +saya.size());
    
        
        saya.push("");
        saya.push("A");
        saya.push("Y");
        saya.push("N");
        saya.push("K");
        saya.push("O");
        saya.push("K");
        saya.push("O");
        saya.push("P");
        System.out.println("\nSOAL NOMOR 4 (PUSH)");
        System.out.println("Buat fungsi POP pada project anda : "+saya+", Ukuran : " +saya.size());

        saya.pop();
        saya.pop();

        System.out.println("\nSOAL NOMOR 4 (POP)");
        System.out.println("Buat fungsi PUSH pada project anda : "+saya+", Ukuran : " +saya.size());
    }
}




