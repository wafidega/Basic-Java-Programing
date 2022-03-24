import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("1. Pendidikan, 2. Biodata, 3. y/n : ");
    int pilihan = input.nextInt();
    if (pilihan == 1) {
      System.out.println("Masukan Nama Depan : ");
      String namaDepan = input.nextLine();
      System.out.println("Masukan Nama Belakang : ");
      String namaBelakang = input.nextLine();
      System.out.println("Masukan Nama Domisili : ");
      String tempatTinggal = input.nextLine();
      System.out.println("Masukan Nama Tanggal Lahir : ");
      String tanggalLahir = input.nextLine();

      // Masukan ke Person
      Person person = new Person();
      person.setFirstName(namaDepan);
      person.setLastName(namaBelakang);
      person.setDomisili(tempatTinggal);
      person.setBirthDate(tanggalLahir);

      System.out.println("BIODATA DIRI");
      person.getFullname();

    } else if (pilihan == 2) {
      System.out.println("Masukan Pendidikan SD : ");
      String SD = input.nextLine();
      System.out.println("Masukan Pendidikan SMP : ");
      String SMP = input.nextLine();
      System.out.println("Masukan Pendidikan SMA : ");
      String SMA = input.nextLine();
      System.out.println("Masukan Pendidikan Kuliah : ");
      String Kuliah = input.nextLine();

      // Masukan ke Pendidikan
      Pendidikan pendidikan = new Pendidikan();
      pendidikan.setDasar(SD);
      pendidikan.setMenengah(SMP);
      pendidikan.setAtas(SMA);
      pendidikan.setCollege(Kuliah);

      pendidikan.getPendidikan();

    }

  }

}

class Person {
  private String firstName;
  private String lastName;
  private String domisili;
  private String birthDate;

  public void setDomisili(String domisili) {
    this.domisili = domisili;
  }

  public String getDomisili() {
    return this.domisili;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setBirthDate(String birthDate) {
    this.lastName = birthDate;
  }

  public String getBirhtDate() {
    return this.birthDate;
  }

  public void getFullname() {
    System.out.println("Nama Lengkap : " + firstName + " " + lastName);
    System.out.println("Saya Tinggal Di : " + domisili);
    System.out.println("Saya Lahir Tanggal : " + birthDate);

  }
}

class Pendidikan {
  private String dasar;
  private String menengah;
  private String atas;
  private String college;

  public void setDasar(String dasar) {
    this.dasar = dasar;
  }

  public String getDasar() {
    return this.dasar;
  }

  public void setMenengah(String menengah) {
    this.menengah = menengah;
  }

  public String getMenengah() {
    return this.menengah;
  }

  public void setAtas(String atas) {
    this.atas = atas;
  }

  public String getAtas() {
    return this.atas;
  }

  public void setCollege(String college) {
    this.college = college;
  }

  public String getCollege() {
    return this.college;
  }

  public void getPendidikan() {
    System.out.println("Sd : " + dasar);
    System.out.println("Smp : " + menengah);
    System.out.println("Sma : " + atas);
    System.out.println("Kuliah : " + college);

  }
}
